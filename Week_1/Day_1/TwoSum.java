// Approach 1 : Nested loops 
// Time Complexity : O(n2)
// Space Complexity : O(1)
class Solution{
    public int[] twoSum(int[] nums , int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1 ; j<nums.length ;j++){
                if(nums[i] + nums[j]== target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1 , -1};
    }
}

// Approach 2 : Using HashMap
// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i  = 0 ; i< nums.length ; i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[]{ map.get(compliment) , i};
            }
         
            map.put( nums[i] , i);
            
        }

        return new int[]{-1 ,-1};
    }
}

