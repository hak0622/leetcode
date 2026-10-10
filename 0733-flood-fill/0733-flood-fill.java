class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};
    boolean[][]visited;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int basic = image[sr][sc];

        if(basic == color) return image;

        visited = new boolean[m][n];
        Queue<int[]>q = new LinkedList<>();

        q.add(new int[]{sr,sc});
        visited[sr][sc] = true;
        image[sr][sc] = color;

        while(!q.isEmpty()){
            int[]cur = q.poll();

            int x = cur[0];
            int y = cur[1];

            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && image[nx][ny] == basic){
                    q.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                    image[nx][ny] = color;
                }
            }
        }
        return image;
    }
}