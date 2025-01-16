import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// DIFFICULT
public class C_Barcode {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int x = Integer.parseInt(str[2]);
        int y = Integer.parseInt(str[3]);


        char[][] ch = new char[n][];

        for(int i=0; i<n; i++){
            ch[i] = br.readLine().toCharArray();
        }


        int[] w = new int[m+1];
        int[] b = new int[m+1];

        for(int j=1; j<=m; j++){
            for(int i=0; i<n; i++){
                w[j] += ch[i][j-1]=='.'? 1 : 0;
                b[j] += ch[i][j-1]=='#'? 1 : 0;
            }
            w[j] += w[j-1];
            b[j] += b[j-1];
        }


        long[][] dp = new long[2][m+1];

        for(int j=1; j<=m; j++){

            long min_a = Integer.MAX_VALUE;
            long min_b = Integer.MAX_VALUE;

            for(int a=x; a<=y; a++){
                if(j-a >= 0){
                    min_a = Math.min(min_a,dp[1][j-a] + w[j]-w[j-a]);
                    min_b = Math.min(min_b,dp[0][j-a] + b[j]-b[j-a]);
                }
            
            }

            dp[0][j] = min_a;
            dp[1][j] = min_b;
        }

        System.out.println(Math.min(dp[0][m], dp[1][m]));
    }
}