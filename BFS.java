class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        visited[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);
            for(int n:adj.get(node)){
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
        return res;
    }
}
