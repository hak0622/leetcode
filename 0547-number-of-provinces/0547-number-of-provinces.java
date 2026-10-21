class Solution {
    int[]parent;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        parent = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++){ // 초기화 과정
            parent[i] = i;
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(isConnected[i][j] == 1){
                    union(i,j);
                }
            }
        }

        for(int i=0; i<n; i++){
            if(find(i) == i) answer++;
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
        else{
            return parent[a] = find(parent[a]);
        }
    }

    public boolean checkSame(int a, int b){
        a = find(a);
        b = find(b);

        if(a == b) return true;

        return false;
    }
}