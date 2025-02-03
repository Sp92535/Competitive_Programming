import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Fox_And_Two_Dots {

    private static int[] dx = { 1, -1, 0, 0 };
    private static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        char grid[][] = new char[row][];

        for (int i = 0; i < row; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        boolean[][] vis = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!vis[i][j] && hasCycle(i, j, grid, vis, grid[i][j], -1, -1)) {
                    System.out.println("Yes");
                    return;
                }

            }
        }

        System.out.println("No");
    }

    private static boolean hasCycle(int srcX, int srcY, char[][] grid, boolean[][] vis, char ch, int prevX, int prevY) {
        if (srcX < 0 || srcY < 0 || srcX == grid.length || srcY == grid[0].length || grid[srcX][srcY] != ch)
            return false;

        if (vis[srcX][srcY])
            return true;

        vis[srcX][srcY] = true;

        boolean ans = false;

        for (int k = 0; k < 4; k++) {

            int nx = srcX + dx[k];
            int ny = srcY + dy[k];

            if (nx == prevX && ny == prevY) continue;

            ans = ans || hasCycle(nx, ny, grid, vis, ch, srcX, srcY);

        }

        return ans;
    }
}