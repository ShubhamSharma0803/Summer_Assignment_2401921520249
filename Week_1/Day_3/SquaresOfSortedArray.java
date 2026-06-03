class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left= 0;
        int right = n -1 ;
        int index = n-1;

        while(left<= right){
            int LeftSquare = nums[left]*nums[left];
            int RightSquare = nums[right]*nums[right];

            if(LeftSquare > RightSquare){
                ans[index] = LeftSquare ;
                left++;
            }
            else{
                ans[index] =RightSquare ;
                right --;
            }
            index--;
        }

        return ans ;
  
    }
}