import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class C_King_s_Path {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x0 = Integer.parseInt(st.nextToken());
        int y0 = Integer.parseInt(st.nextToken());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        Set<String> path = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j <= b; j++) {
                path.add(r + " " + j);
            }
        }
        int[] dx = { 0, 0, 1, -1, -1, 1, 1, -1 };
        int[] dy = { 1, -1, 0, 0, -1, 1, -1, 1 };

        Queue<int[]> qu = new LinkedList<>();

        qu.add(new int[] { x0, y0 });
        path.remove(x0 + " " + y0);

        int ans = 0;
        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                int[] curr = qu.poll();

                int x = curr[0], y = curr[1];

                if (x == x1 && y == y1) {
                    System.out.println(ans);
                    return;
                }

                for (int k = 0; k < 8; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (path.contains(nx + " " + ny)) {
                        qu.add(new int[] { nx, ny });
                        path.remove(nx + " " + ny);
                    }
                }
            }
            ans++;
        }
        System.out.println(-1);
    }
}