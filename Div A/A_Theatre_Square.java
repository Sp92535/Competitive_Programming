import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Theatre_Square {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long m = Long.parseLong(st.nextToken()), n = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken());
        
        System.out.println(((m+a-1)/a)*((n+a-1)/a));
    }
}