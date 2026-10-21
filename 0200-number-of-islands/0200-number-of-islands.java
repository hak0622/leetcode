class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][]visited = new boolean[m][n];
        Queue<int[]>q = new LinkedList<>();

        int answer = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    visited[i][j] = true;
                    q.add(new int[]{i,j});
                    
                    while(!q.isEmpty()){
                        int[]cur = q.poll();

                        int x = cur[0];
                        int y = cur[1];

                        for(int d=0; d<4; d++){
                            int nx = x + dx[d];
                            int ny = y + dy[d];

                            if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && grid[nx][ny] == '1'){
                                visited[nx][ny] = true;
                                q.add(new int[]{nx,ny});
                            }
                        }
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}