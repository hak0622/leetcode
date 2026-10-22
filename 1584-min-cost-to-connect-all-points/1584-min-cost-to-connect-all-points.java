class Solution {
    int[]parent;

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int answer = 0;
        
        parent = new int[n];

        for(int i=0; i<n; i++){
            parent[i] = i;
        }

        List<int[]>edges = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int cost = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);

                edges.add(new int[]{i,j,cost});
            }
        }

        edges.sort((a,b) -> a[2] - b[2]);

        for(int[]edge : edges){
            int a = edge[0];
            int b = edge[1];
            int cost = edge[2];

            if(find(a) != find(b)){
                union(a,b);
                answer = answer + cost;
            }
        }

        return answer;
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