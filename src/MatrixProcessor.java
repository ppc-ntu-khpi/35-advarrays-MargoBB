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
