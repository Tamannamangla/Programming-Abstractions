class Solution {
    public boolean isPalindrome(int x) {
        String st = String.valueOf(x);
        String s = new StringBuilder(st).reverse().toString();
      
        return st.equals(s);
    }
}
