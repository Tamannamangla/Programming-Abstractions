class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char ch : tasks){
            freq[ch-'A']++;
        }
        int maxFreq=0;
        for(int a : freq){
            maxFreq = Math.max(maxFreq,a);
        }
        int count = 0;
        for(int a : freq){
            if(a == maxFreq){
                count++;
            }
        }
        int res = ((maxFreq-1)*(n+1))+count;
        int ans = Math.max(tasks.length,res);
        return ans;
    }
}