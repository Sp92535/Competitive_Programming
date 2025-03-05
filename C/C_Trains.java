import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C_Trains {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        long meet = lcm(x, y);

        long D = meet / x - 1;
        long M = meet / y - 1;

        if (x < y)
            M += 1;
        else
            D += 1;
        System.out.println(M > D ? "Masha" : M < D ? "Dasha" : "Equal");
    }

    private static long gcd(long x, long y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    private static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

}