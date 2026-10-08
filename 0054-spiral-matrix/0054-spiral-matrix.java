class Solution {
    int[]dx = {0,1,0,-1};
    int[]dy = {1,0,-1,0};

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[][]visited = new boolean[m][n];

        int x = 0;
        int y = 0;
        int d = 0;

        for(int i=0; i<m * n; i++){
            list.add(matrix[x][y]);
            visited[x][y] = true;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny]){
                d = (d+1) % 4;

                nx = x + dx[d];
                ny = y + dy[d];
            }
            
            x = nx;
            y = ny;
        }
        return list;
    }
}