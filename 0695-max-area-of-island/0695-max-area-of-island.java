class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};
    boolean[][]visited;

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        visited = new boolean[n][m];

        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int area = dfs(grid,i,j);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public int dfs(int[][]grid, int x, int y){
        visited[x][y] = true;
        int count = 1;

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] == 1 && !visited[nx][ny]){
                count = count + dfs(grid,nx,ny);
            }
        }

        return count;
    }
}