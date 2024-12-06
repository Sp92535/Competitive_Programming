import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_New_Password {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String str = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();

        while(n >= k){
            sb.append(str.substring(0,k));
            n -= k;
        }
        if(n>0) sb.append(str.substring(0,n));
        System.out.println(sb.toString());
    }
}