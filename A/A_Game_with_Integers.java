import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Game_with_Integers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n % 3 != 0 ? "First" : "Second");
        }
    }
}