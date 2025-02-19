import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_Lucky_Permutation_Triple {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n%2==0){
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print((i * 2) % n + " ");
        }
    }
}