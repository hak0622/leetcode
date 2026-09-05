class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[]dx = {0,1,0,-1};
        int[]dy = {1,0,-1,0};
        
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][]visited = new boolean[n][m];
        List<Integer>list = new ArrayList<>();

        int x = 0;
        int y = 0;
        int d = 0;

        for(int count=0; count < n*m; count++){
            list.add(matrix[x][y]);
            visited[x][y] = true;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny]){
                d = (d + 1) % 4;

                nx = x + dx[d];
                ny = y + dy[d];
            }
            
            x = nx;
            y = ny;
        }
        return list;
    }
}