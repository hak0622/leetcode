class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        int original = image[sr][sc];

        if(original == color) return image;

        Queue<int[]>q = new LinkedList<>();

        q.add(new int[]{sr,sc});
        image[sr][sc] = color;

        while(!q.isEmpty()){
            int[]cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && image[nx][ny] == original){
                    image[nx][ny] = color;
                    q.add(new int[]{nx,ny});
                }
            }
        }
        return image;
    }
}