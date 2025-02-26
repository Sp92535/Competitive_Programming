import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_Duff_in_Love {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long r = n;
        long ans = 1L;

        List<Long> divs = new ArrayList<>();
        List<Long> big = new ArrayList<>();
        for (long l = 1L; l < r && l * l <= n; l++) {
            if (n % l == 0) {

                r = n / l;

                if (l > r) {
                    break;
                }
                divs.add(l);
                if (l == r) {
                    break;
                }

                big.add(r);
            }
        }

        Collections.reverse(big);
        divs.addAll(big);

        int size = divs.size();
        for (int idx = size - 1; idx >= 0; idx--) {
            long curr = divs.get(idx);
            boolean flag = true;
            for (long a : divs) {
                if (a == 1L)
                    continue;
                if (curr % (a * a) == 0) {
                    flag = false;
                    break;
                }
                if (a * a > curr) {
                    break;
                }
            }
            if (flag) {
                ans = curr;
                break;
            }
        }

        System.out.println(ans);
    }
}