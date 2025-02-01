import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B_Gena_s_Code {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());


        BigInteger ans = new BigInteger(st.nextToken());

        for(int i=1; i<n; i++){
            ans = ans.multiply(new BigInteger(st.nextToken()));
        }
    
        System.out.println(ans);
    }

}