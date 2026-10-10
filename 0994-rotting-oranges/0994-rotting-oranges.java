class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};
    boolean[][]visited;

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        visited = new boolean[m][n];
        int fresh = 0;
        int answer = 0;
        Queue<int[]>q = new LinkedList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }else{
                    continue;
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

                    if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && grid[nx][ny] == 1){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                        grid[nx][ny] = 2;
                        fresh--;
                    }
                }
            }
            answer++;
        }

        if(fresh > 0) return -1;

        return answer;
    }
}