import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Mashmokh_and_Tokens {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());


        for(int i=0; i<n; i++){

            long x = Long.parseLong(st.nextToken());

            long an = ((a*x)%b)/a;

            System.out.print(an +" ");
        }

    }

}