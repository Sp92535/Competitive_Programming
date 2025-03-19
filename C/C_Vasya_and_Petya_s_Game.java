import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C_Vasya_and_Petya_s_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] isNotPrime = new boolean[n + 1];
        List<Integer> ans = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isNotPrime[i])
                continue;
            int j = i * 2;
            while (j <= n) {
                isNotPrime[j] = true;
                j += i;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isNotPrime[i])
                continue;

            for (int j = i; j <= n; j *= i) {
                ans.add(j);
            }
        }

        System.out.println(ans.size());
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}