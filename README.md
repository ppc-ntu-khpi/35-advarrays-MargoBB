[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=11250052)
# Практична робота "Поглиблене використання масивів"

## Результат виконання завдання

## Умова завдання

**4.** Знайти друге за величиною число у матриці розміром N x M.

## Завдання №1. Внесення змін до стартового коду

1. Код класу **"MatrixProcessor.java"** -

```java
class MatrixProcessor {
    
    public int findSecondLargest(int[][] matrix) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
        }

        return secondLargest;
    }
}
```

2. Код класу **"Main.java"** -

```java
import domain.MatrixProcessor;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 9, 2},
            {3, 8, 1},
            {4, 7, 6}
        };

        MatrixProcessor processor = new MatrixProcessor();
        int secondLargest = processor.findSecondLargest(matrix);
        System.out.println("The second largest number in the matrix is: " + secondLargest);
    }
}
```

3. Результати працюючого коду -

<img src="https://github.com/ppc-ntu-khpi/35-advarrays-MargoBB/blob/master/src/1.png">

[![Gitter](https://badges.gitter.im/PPC-SE-2020/OOP.svg)](https://gitter.im/PPC-SE-2020/OOP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)