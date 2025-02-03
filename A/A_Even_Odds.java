import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Even_Odds {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        
        long odd_max_limit = (n+1)/2 ;
        if(k > odd_max_limit){
            k -= odd_max_limit;
            System.out.println(2 + (k-1)*2);
        }else{
            System.out.println(1 + (k-1)*2);
        }     


    }
}