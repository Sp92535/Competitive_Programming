import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Easy_Number_Challenge {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        long[] div = new long[a*b*c + 1];

        Arrays.fill(div,1L);
        
        int n = div.length;

        for(int i=2; i<n; i++){
            
            int curr = i;
            while(curr < n){
                div[curr] += 1L;
                curr += i;
            }
        }

        long MOD = (1 << 30);

        long ans = 0;

        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                for(int k=1; k<=c; k++){
                    ans += div[i*j*k];
                    ans %= MOD;
                }
            }
        }

        System.out.println(ans);
    }
}