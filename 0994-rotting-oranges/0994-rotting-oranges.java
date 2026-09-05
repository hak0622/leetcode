class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        int answer = 0;
        Queue<int[]>q = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        while(!q.isEmpty() && fresh > 0){
            int size = q.size();

            for(int i=0; i<size; i++){
                int[]cur = q.poll();

                int x = cur[0];
                int y = cur[1];
                
                for(int d=0; d<4; d++){
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] == 1){
                        grid[nx][ny] = 2;
                        fresh--;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            answer++;
        }

        return fresh > 0 ? -1 : answer;
    }
}