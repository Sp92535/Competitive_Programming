import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Kefa_and_Company {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int x = 0, y = 0;
        long curr = 0, max = 0;

        while (y < n) {

            while (y < n && arr[y][0] - arr[x][0] < d) {
                curr += arr[y++][1];
            }
            max = Math.max(curr, max);

            while (y < n && arr[y][0] - arr[x][0] >= d) {
                curr -= arr[x++][1];
            }
        }

        System.out.println(max);

    }
}