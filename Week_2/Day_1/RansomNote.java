class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Store available characters from magazine
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Try to use characters for ransom note
        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            freq[ch - 'a']--;

            // Character not available
            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}