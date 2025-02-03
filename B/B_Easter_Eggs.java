import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Easter_Eggs {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String base = "VIBGYOR", rem = "GYO";

        StringBuilder sb = new StringBuilder();
        while (n > 7) {
            n -= 7;
            sb.append(base);
        }

        if(n > 3){
            sb.append(base.substring(0,n));
        }else{
            sb.append(rem.substring(0,n));
        }
        
        System.out.println(sb.toString());
    }
}