class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        // Check every possible pattern length
        for (int len = 1; len <= n / 2; len++) {

            // Pattern length must divide string length
            if (n % len != 0) {
                continue;
            }

            String pattern = s.substring(0, len);

            StringBuilder repeated = new StringBuilder();

            int repeatCount = n / len;

            for (int i = 0; i < repeatCount; i++) {
                repeated.append(pattern);
            }

            if (repeated.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}