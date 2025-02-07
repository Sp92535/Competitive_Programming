import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Tavas_and_SaDDas {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        long n = 1L;
        int len = str.length();

        for (int i = 1; i < len; i++) {
            n += (1L << i);
        }

        for (int i = len - 1; i >= 0; i--) {
            n += (str.charAt(i) == '4' ? 0 : 1) * (1L << (len - 1 - i));
        }

        System.out.println(n);

    }
}