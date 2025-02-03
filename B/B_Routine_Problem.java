import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Routine_Problem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        // Horizontal
        int num_h = c * b - a * d, den_h = c * b;
        int gcd_h = gcd(num_h, den_h);
        
        // Vertical
        int num_v = a * d - c * b, den_v = d * a;
        int gcd_v = gcd(num_v, den_v);

        
        if (num_h < 0) {
            num_v /= gcd_v;
            den_v /= gcd_v;
            System.out.println(Math.abs(num_v) + "/" + Math.abs(den_v));
        } else {
            num_h /= gcd_h;
            den_h /= gcd_h;
            System.out.println(Math.abs(num_h) + "/" + Math.abs(den_h));
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}