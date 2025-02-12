import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_Mr_Kitayuta_s_Colorful_Graph {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] par = new int[n + 1];
        for (int i = 0; i <= n; i++)
            par[i] = i;

        Map<Integer, int[]> parent = new HashMap<>();
        Map<Integer, int[]> rank = new HashMap<>();

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (!parent.containsKey(c)) {
                parent.put(c, par.clone());
                rank.put(c, new int[n + 1]);
            }
            union(a, b, c, parent, rank);
        }

        int q = Integer.parseInt(br.readLine());


        for (int i = 0; i < q; i++) {

            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int an = 0;
            for (int color : parent.keySet()) {
                int p1 = getParent(u, color, parent);
                int p2 = getParent(v, color, parent);

                if (p1 == p2)
                    an++;
            }
            System.out.println(an);
        }
    }

    private static int getParent(int x, int c, Map<Integer, int[]> parent) {
        if (parent.get(c)[x] == x)
            return x;
        return parent.get(c)[x] = getParent(parent.get(c)[x], c, parent);
    }

    private static void union(int a, int b, int c, Map<Integer, int[]> parent, Map<Integer, int[]> rank) {
        int p1 = getParent(a, c, parent);
        int p2 = getParent(b, c, parent);

        if (p1 == p2)
            return;

        int r1 = rank.get(c)[p1];
        int r2 = rank.get(c)[p2];

        if (r1 > r2) {
            rank.get(c)[p1] += rank.get(c)[p2] + 1;
            parent.get(c)[p2] = p1;
        } else {
            rank.get(c)[p2] += rank.get(c)[p1] + 1;
            parent.get(c)[p1] = p2;
        }

    }
}