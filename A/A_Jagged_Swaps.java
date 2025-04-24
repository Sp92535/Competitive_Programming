import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Jagged_Swaps {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());

            for (int i = 1; i < n; i++) {
                int next = Integer.parseInt(st.nextToken());
                if (first > next) {
                    System.out.println("NO");
                    first = -1;
                    break;
                }
            }
            if (first != -1) {
                System.out.println("YES");
            }
        }
    }
}