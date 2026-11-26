class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] arr = new int[l];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<l;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int a = st.pop();
                arr[a] = i-a;
            }
            st.push(i);
        }

        return arr;
    }
}