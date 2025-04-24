import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Cover_in_Water {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String curr = br.readLine();

            int totalEmpty = 0, cons = 0;
            for (int i = 0; i < n; i++) {
                if (curr.charAt(i) == '.') {
                    cons++;
                    totalEmpty++;
                } else if (cons < 3) {
                    cons = 0;
                }
            }
            System.out.println(cons >= 3 ? 2 : totalEmpty);
        }

    }
}