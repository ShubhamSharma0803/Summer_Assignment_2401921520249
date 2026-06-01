// Approach : Two Pointers (Same Direction)
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0){
            return 0;
        }

        int left = 0;
        
        for(int right =1; right < nums.length ; right++ ){
            if(nums[right]!= nums[right-1]){
                left++;
                nums[left] = nums[right];
            }
        }

        return left+1;
    }
}