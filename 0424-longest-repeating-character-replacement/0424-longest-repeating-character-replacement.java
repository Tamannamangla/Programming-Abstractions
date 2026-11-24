class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left =0,maxFreq=0;
        int ans =0;
        for(int right=0;right<s.length();right++){
            arr[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,arr[s.charAt(right)-'A']);
            while((right-left+1)-maxFreq>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;

    }
}