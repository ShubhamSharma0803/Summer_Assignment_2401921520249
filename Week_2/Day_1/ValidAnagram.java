class Solution {
    public boolean isAnagram(String s, String t) {

        // If lengths are different, they can never be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count characters from first string
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Remove characters using second string
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // Check if every count became zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}