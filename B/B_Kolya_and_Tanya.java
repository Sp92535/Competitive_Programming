import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Kolya_and_Tanya {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long tot = 1;
        long six = 1;

        long MOD = (long)1e9 + 7;

        for(int i=0; i<n; i++){
            six *= 7;
            six %= MOD;
        }


        for(int i=0; i<3*n; i++){
            tot *= 3;
            tot %= MOD;
        }


        System.out.println((tot - six + MOD)%MOD);

    }
}