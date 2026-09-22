class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        // visited array
        boolean[] visited = new boolean[adj.size()]; 
        
        // empty queue
        Queue<Integer> queue = new LinkedList<>();
        
        // List array for storing elements
        ArrayList<Integer> result = new ArrayList<>();
        
        // starting node
        queue.add(0);
        
        // visited
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int neighbour : adj.get(node)){
                if(!visited[neighbour]){
                    
                    visited[neighbour] = true;
                    
                    queue.add(neighbour);
                }
            }
        }
        return result;
    }
}