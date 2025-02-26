import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B_Fox_Dividing_Cheese {

    public static void main(String[] args) throws IOException {
        Map<Integer, Long> A, B;
        A = new HashMap<>();
        B = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        cover(a, 0, A);
        cover(b, 0, B);

        long ans = a + b;
        for (int key : A.keySet()) {
            if (B.containsKey(key)) {
                ans = Math.min(ans, A.get(key) + B.get(key));
            }
        }

        System.out.println(ans != a + b ? ans : -1);

    }

    private static void cover(int n, long move, Map<Integer, Long> X) {
        if (X.containsKey(n) && X.get(n) <= move) {
            return;
        }

        X.put(n, move);

        if (n % 5 == 0) {
            cover(n / 5, move + 1, X);
        }
        if (n % 3 == 0) {
            cover(n / 3, move + 1, X);
        }
        if (n % 2 == 0) {
            cover(n / 2, move + 1, X);
        }
    }
}