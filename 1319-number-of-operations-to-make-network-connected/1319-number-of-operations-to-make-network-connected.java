class Solution {
    int[]parent;

    public int makeConnected(int n, int[][] connections) {
        parent = new int[n];
        int answer = 0;

        if(connections.length < n - 1) return -1;

        for(int i=0; i<n; i++){
            parent[i] = i;
        }

        for(int i=0; i<connections.length; i++){
            int a = connections[i][0];
            int b = connections[i][1];

            if(find(a) != find(b)){
                union(a,b);
            }
        }

        for(int i=0; i<n; i++){
            if(find(i) == i){
                answer++;
            }
        }

        return answer - 1;
    }

    public void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a != b) parent[b] = a;
    }

    public int find(int a){
        if(a == parent[a]) return a;

        return parent[a] = find(parent[a]);
    }
}
