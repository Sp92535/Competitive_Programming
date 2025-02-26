import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_Watchmen {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(arr, (a, b) -> {
            int x = a[0] - b[0];
            if (x == 0)
                return a[1] - b[1];
            return x;
        });

        long z = 1;
        long pairs = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i][0] == arr[i - 1][0]) {
                z++;
            } else {
                pairs += (z - 1) * z / 2;
                z = 1;
            }
        }
        pairs += (z - 1) * z / 2;
        z = 1;

        Arrays.sort(arr, (a, b) -> {
            int y = a[1] - b[1];
            if (y == 0)
                return a[0] - b[0];
            return y;
        });

        long k = 1;
        long dec = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i][1] == arr[i - 1][1]) {
                z++;
                if (arr[i][0] == arr[i - 1][0])
                    k++;
                else {
                    dec += (k - 1) * k / 2;
                    k = 1;
                }
            } else {
                dec += (k - 1) * k / 2;
                pairs += (z - 1) * z / 2;
                pairs -= dec;
                z = 1;
                k = 1;
                dec = 0;
            }
        }

        dec += (k - 1) * k / 2;
        pairs += (z - 1) * z / 2;
        pairs -= dec;

        System.out.println(pairs);
    }
}