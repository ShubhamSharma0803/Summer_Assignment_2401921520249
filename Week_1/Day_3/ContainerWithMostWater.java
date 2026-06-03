class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0 ;
        int left = 0 ;
        int right = height.length -1;

        while(left < right){
            int vertical = Math.min(height[left] , height[right]);
            int base = right - left;
            int currentWater = vertical*base;
            maxWater = Math.max( maxWater , currentWater );
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxWater ;
    }
}
