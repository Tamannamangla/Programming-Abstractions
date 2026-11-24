class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ls = new ArrayList<>();

        if(s.length() < p.length()) {
            return ls;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        // Store frequency of p
        for(int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for(int right = 0; right < s.length(); right++) {

            // Add new character
            b[s.charAt(right) - 'a']++;

            // Maintain window size
            if(right - left + 1 > p.length()) {
                b[s.charAt(left) - 'a']--;
                left++;
            }

            // Compare frequencies
            if(right - left + 1 == p.length()) {
                if(Arrays.equals(a, b)) {
                    ls.add(left);
                }
            }
        }

        return ls;
    }
}