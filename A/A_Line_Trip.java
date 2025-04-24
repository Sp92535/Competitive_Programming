import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Line_Trip {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            StringTokenizer arr = new StringTokenizer(br.readLine());

            int prev = 0, ans = 0;
            for (int i = 0; i < n; i++) {
                int curr = Integer.parseInt(arr.nextToken());
                ans = Math.max(ans, curr - prev);
                prev = curr;
            }
            ans = Math.max(2 * (x - prev), ans);
            System.out.println(ans);
        }

    }
}