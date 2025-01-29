import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Valera_and_Contest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int l = Integer.parseInt(str[2]);
        int r = Integer.parseInt(str[3]);
        int sall = Integer.parseInt(str[4]);
        int sk = Integer.parseInt(str[5]);

        int z = solve(l, r, sk, k);
        if(k!=n)
            solve(l, z, sall - sk, n - k);
    }

    private static int solve(int l, int r, int sum, int k) {

        int each = sum / k;
        int extra = sum % k;

        int[] arr = new int[k];
        Arrays.fill(arr, each);

        for (int i = 0; i < k && extra > 0; i++) {

            int cap = r - each;

            arr[i] += Math.min(extra, cap);
            extra -= cap;

        }
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");

        return arr[k - 1];
    }
}