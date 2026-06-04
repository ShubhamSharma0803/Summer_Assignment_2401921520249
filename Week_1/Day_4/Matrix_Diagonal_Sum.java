class Solution {
    public int diagonalSum(int[][] matrix) {

        int size = matrix.length;
        int total = 0;

        // Add elements from both diagonals
        for (int row = 0; row < size; row++) {

            // Primary diagonal
            total += matrix[row][row];

            // Secondary diagonal
            total += matrix[row][size - row - 1];
        }

        // If matrix size is odd, center element gets counted twice
        if (size % 2 == 1) {
            total -= matrix[size / 2][size / 2];
        }

        return total;
    }
}