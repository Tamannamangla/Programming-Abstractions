class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        if(s.length()<p.length()){
            return ls;
        }
        else if(s.length()==p.length()){
            if(isAnagram(s,p)){
                ls.add(0);
                return ls;
            }
            else{
                return ls;
            }
        }
        for(int i=0;i<=s.length() - p.length();i++){
            int len = p.length();
            String newStr = s.substring(i,i+len);
            if(isAnagram(newStr,p)){
                ls.add(i);
            }
        }
        return ls;

    }
    public boolean isAnagram(String a, String b) {
        char[] st = a.toCharArray();
        char[] ts = b.toCharArray();
        if(a.length()!= b.length()){
            return false;
        }
        Arrays.sort(st);
        Arrays.sort(ts);
        for(int i=0;i<a.length();i++){
            if(st[i]!= ts[i]){
                return false;
            }
        }
        return true;
    }
}