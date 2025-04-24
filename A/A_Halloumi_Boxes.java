import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Halloumi_Boxes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            StringTokenizer arr = new StringTokenizer(br.readLine());

            int prev = 0;
            for (int i = 0; i < n && k <= 1; i++) {
                int curr = Integer.parseInt(arr.nextToken());
                if (curr < prev) {
                    System.out.println("NO");
                    prev = 5000;
                    break;
                }
                prev = curr;
            }
            if (prev != 5000)
                System.out.println("YES");
        }
    }
}