class Solution {
    public boolean isValid(String s) {
        boolean find=false;
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if(ch==']'){
                    char a=st.pop();
                    if(a!='['){
                        return false;
                    }
                }
                if(ch=='}'){
                    char a=st.pop();
                    if(a!='{'){
                        return false;
                    }
                }
                if(ch==')'){
                    char a=st.pop();
                    if(a!='('){
                        return false;
                    }
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}