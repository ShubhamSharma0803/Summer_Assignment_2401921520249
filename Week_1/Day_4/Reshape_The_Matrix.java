class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int currentRows = nums.length;
        int currentCols = nums[0].length;

        // Reshape is only possible if total elements remain same
        if (currentRows * currentCols != r * c) {
            return nums;
        }

        int[][] reshaped = new int[r][c];

        int position = 0;

        // Traverse original matrix and place values one by one
        for (int row = 0; row < currentRows; row++) {
            for (int col = 0; col < currentCols; col++) {

                reshaped[position / c][position % c] = nums[row][col];
                position++;
            }
        }

        return reshaped;
    }
}