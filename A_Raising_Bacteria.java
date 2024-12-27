import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Raising_Bacteria {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        while (n>0) {
            ans += n%2;
            n >>= 1;
        }
        System.out.println(ans);
    }
}