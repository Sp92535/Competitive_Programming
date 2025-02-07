import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Minimum_Ternary_String {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        int ones = 0;
        int zeros = 0;
        int n = ch.length;
        int twoIdx = n;
        for (int i = 0; i < n; i++) {
            ones += ch[i] == '1' ? 1 : 0;
            if (twoIdx == n) {
                if (ch[i] == '2')
                    twoIdx = i;
                else if (ch[i] == '0')
                    zeros++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < zeros; i++) {
            sb.append(0);
        }
        for (int i = 0; i < ones; i++) {
            sb.append(1);
        }
        for (int i = twoIdx; i < n; i++) {
            if (ch[i] != '1') {
                sb.append(ch[i]);
            }
        }
        System.out.println(sb.toString());
    }
}