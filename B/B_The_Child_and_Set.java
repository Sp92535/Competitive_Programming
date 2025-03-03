import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class B_The_Child_and_Set {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        int[][] arr = new int[limit + 1][];
        arr[0] = new int[] { 0, 0 };
        int prev = 1;
        arr[1] = new int[] { 1, 1 };
        for (int i = 2; i <= limit; i++) {
            if (i - prev == prev) {
                arr[i] = new int[] { i, i };
                prev = i;
            } else {
                arr[i] = new int[] { i, arr[i - prev][1] };
            }
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        List<Integer> set = new ArrayList<>();

        for (int i = 0; i < limit && sum > 0; i++) {
            if (arr[i][0] != 0 && sum - arr[i][1] >= 0) {
                sum -= arr[i][1];
                set.add(arr[i][0]);
            }
        }
        if (sum > 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(set.size());
        for (int i : set)
            System.out.print(i + " ");
    }
}