class Solution {
    public void moveZeroes(int[] nums) {
        int index = FirstOccurrence(nums);
        if(index == -1 ){
            return ;
        }


        int left = index ;
        for(int right = index +1 ; right < nums.length ; right ++){
            if(nums[right] != 0 ){
                int temp = nums[left];
                nums[left] = nums[right ];
                nums[right] = temp ; 
                left ++;
            }
        }
    }

    // Helper Function 
    private int FirstOccurrence(int[] nums){
        for(int i = 0 ;  i < nums.length ; i++){
            if(nums[i] == 0 ){
                return i;
            }
        }

        return -1;
    }
}