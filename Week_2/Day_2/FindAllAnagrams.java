class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] targetFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of pattern string
        for (int i = 0; i < p.length(); i++) {
            targetFreq[p.charAt(i) - 'a']++;
        }

        int windowSize = p.length();

        for (int right = 0; right < s.length(); right++) {

            windowFreq[s.charAt(right) - 'a']++;

            // Remove extra character from left
            if (right >= windowSize) {
                windowFreq[s.charAt(right - windowSize) - 'a']--;
            }

            // Window matches pattern
            if (Arrays.equals(targetFreq, windowFreq)) {
                result.add(right - windowSize + 1);
            }
        }

        return result;
    }
}