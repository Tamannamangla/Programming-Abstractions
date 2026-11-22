class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray();
        char[] ts = t.toCharArray();
        if(s.length()!= t.length()){
            return false;
        }
        Arrays.sort(st);
        Arrays.sort(ts);
        for(int i=0;i<s.length();i++){
            if(st[i]!= ts[i]){
                return false;
            }
        }
        return true;
    }
}