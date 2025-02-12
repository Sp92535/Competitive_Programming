import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Vanya_and_Lanterns {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Arrays.sort(arr);
        double d = arr[0] - 0.0;
        for (int i = 1; i < n; i++) {
            d = Math.max(d, (arr[i] - arr[i - 1]) / 2.0);
        }
        d = Math.max(d, l - arr[n - 1]);

        System.out.println(d);
    }
}