class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] targetFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            targetFreq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            windowFreq[s2.charAt(right) - 'a']++;

            // Keep window size fixed
            if (right >= windowSize) {
                windowFreq[s2.charAt(right - windowSize) - 'a']--;
            }

            // Compare both frequency arrays
            if (Arrays.equals(targetFreq, windowFreq)) {
                return true;
            }
        }

        return false;
    }
}
