import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Counterexample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long l = Long.parseLong(input[0]);
        long r = Long.parseLong(input[1]);

        // Check if the range is sufficient for a triplet
        if (r - l < 2) {
            System.out.println(-1);
            return;
        }

        // If l is even, (l, l+1, l+2) is a valid triplet
        if (l % 2 == 0) {
            System.out.println(l + " " + (l + 1) + " " + (l + 2));
        } else {
            // If l is odd, (l+1, l+2, l+3) is a valid triplet
            if (r - l >= 3) {
                System.out.println((l + 1) + " " + (l + 2) + " " + (l + 3));
            } else {
                System.out.println(-1);
            }
        }
    }
}
