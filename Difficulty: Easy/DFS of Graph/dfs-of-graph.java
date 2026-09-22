class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        boolean vis[] = new boolean[adj.size()];
        
        dfs(0,adj,vis,result);
        return result;
        
    }
    
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean vis[],
    ArrayList<Integer> result  ){
        
        vis[v] = true;
        result.add(v);
        
        for(Integer neigh : adj.get(v)){
            if(!vis[neigh]){
                dfs(neigh, adj, vis, result);
            }
        }
        
        
    }
}