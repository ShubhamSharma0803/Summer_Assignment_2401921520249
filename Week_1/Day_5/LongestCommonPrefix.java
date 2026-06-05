class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Brute Force Approach
        // Compare characters column by column across all strings
        // Time Complexity : O(n*m) -> n is the length of shortest string 
        // m is the length of strs array 
        // Space Complexity : O(1)
        // if(strs.length ==1){
        //     return strs[0];
        // }

        // for(int i=0; i<strs[0].length(); i++){
        //     for(String s : strs){
        //         if(i==s.length() || s.charAt(i)!=strs[0].charAt(i) ){
        //             return s.substring(0,i);
        //         }
        //     }
        // }
        // return strs[0];

        // Sorting Approach 
        // Sort all the strings in lexographical order and compare only 1st and last string
        // Time Complexity : O(n*mlogm)
        // Space Complexity : O(1) 
        if(strs.length ==1){
            return strs[0];
        }

        StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);
        for(int i=0 ; i<strs[0].length();i++){
            if(strs[0].charAt(i)!= strs[strs.length-1].charAt(i)){
                break;
            }
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }
}