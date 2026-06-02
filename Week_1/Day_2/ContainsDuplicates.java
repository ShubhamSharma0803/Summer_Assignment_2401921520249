class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Approach 1 : Nested loop 
        // Time Complexity : O(n2)
        // Space Complexity : O(1)
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

     


        // Approach 2 : Sorting 
        // Time Complexity : O(nlogn)
        // Space Complexity : O(1)

        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;

        // Approach 3 : Set
        // Time Complexity : O(n)
        // Space Complexity : O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
             if(set.contains(num)){
                    return true;
            }
            set.add(num);
        }
        return false;


        // Approach 4 : Hashmap 
        // Time Complexity : O(n)
        // Space Complexity: O(n)

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length ;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1){
                return true;
            }
        }
        return false;

    }
}
