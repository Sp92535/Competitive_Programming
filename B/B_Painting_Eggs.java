import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Painting_Eggs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = 0, g = 0;

        char[] ch = new char[n];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());

            if (Math.abs(a + A - g) < Math.abs(g + G - a)) {
                ch[i] = 'A';
                a += A;
            } else {
                ch[i] = 'G';
                g += G;
            }

        }

        if (Math.abs(a - g) <= 500) {
            System.out.println(new String(ch));
        } else {
            System.out.println(-1);
        }

    }
}