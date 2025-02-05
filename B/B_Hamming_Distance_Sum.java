import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Hamming_Distance_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        int len1 = s1.length();
        int len2 = s2.length();

        int[] a = new int[len1 + 1];
        int[] b = new int[len2 + 1];
        long[][] sum = new long[len2 + 1][2];

        for (int i = 1; i <= len1; i++) {
            a[i] = s1.charAt(i - 1) - '0';
        }
        for (int i = 1; i <= len2; i++) {
            b[i] = s2.charAt(i - 1) - '0';
        }

        for (int i = 1; i <= len2; i++) {
            sum[i][0] = sum[i - 1][0];
            sum[i][1] = sum[i - 1][1];
            sum[i][b[i]]++;
        }

        long ans = 0;
        for (int i = 1; i <= len1; i++) {
            ans += sum[len2 - len1 + i][1 - a[i]];
            ans -= sum[i - 1][1 - a[i]];
        }

        System.out.println(ans);
    }
}
