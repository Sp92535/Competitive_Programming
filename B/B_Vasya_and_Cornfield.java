import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Vasya_and_Cornfield {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double n = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        double a = Math.sqrt(2) * (n - d);
        double b = Math.sqrt(2) * d;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());

            double disA1 = Math.abs(x + y - d) / Math.sqrt(2);
            double disA2 = Math.abs(x + y + d - 2.0 * n) / Math.sqrt(2);

            if (disA1 + disA2 - a > 0.000000000001) {
                System.out.println("NO");
                continue;
            }

            double disB1 = Math.abs(y - x - d) / Math.sqrt(2);
            double disB2 = Math.abs(x - y - d) / Math.sqrt(2);

            if (disB1 + disB2 - b > 0.000000000001) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }

    }
}