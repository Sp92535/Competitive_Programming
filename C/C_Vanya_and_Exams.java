import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C_Vanya_and_Exams {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int maxScore = Integer.parseInt(st.nextToken());
        long reqTot = Long.parseLong(st.nextToken())*n;
        long currTot = 0;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[i][0] = a;
            arr[i][1] = b;

            currTot += a;
        }

        Arrays.sort(arr, (a, b) -> a[1] - b[1]);

        long essay = 0;
        int x = 0;
        while (currTot < reqTot && x < n) {

            long increment = 0;

            long l = 1, r = maxScore - arr[x][0];
            while (l <= r) {

                long mid = l + (r - l) / 2;

                if (currTot + mid <= reqTot) {
                    increment = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            essay += 1L * increment * arr[x][1];
            currTot += increment;
            x++;
        }

        System.out.println(essay);

    }
}