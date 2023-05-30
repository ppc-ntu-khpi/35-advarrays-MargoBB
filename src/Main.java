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
