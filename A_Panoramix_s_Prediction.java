import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Panoramix_s_Prediction {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        boolean[] prime = new boolean[51];

        for(int i=2; i<51; i++){
            
            if(prime[i]) continue;

            int k = 2*i;
            while(k < 51){
                prime[k] = true;
                k += i;
            }        
        }
        if(prime[m]){
            System.out.println("NO");
            return;
        }
        for(int i=n+1; i<m; i++){
            if(!prime[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}