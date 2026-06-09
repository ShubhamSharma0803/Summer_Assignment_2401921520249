class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> window = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char currentChar = s.charAt(right);

            // Remove characters until duplicate disappears
            while (window.contains(currentChar)) {
                window.remove(s.charAt(left));
                left++;
            }

            // Add current character to window
            window.add(currentChar);

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}