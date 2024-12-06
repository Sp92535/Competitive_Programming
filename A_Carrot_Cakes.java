import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Carrot_Cakes {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int currTime = (n+k-1)/k*t;

        int cakesDone = (d+t-1)/t*k;
        n -= cakesDone;

        int nextTimeA = (d+t-1)/t*t;
        int nextTimeB = d;


        if(n<=0){
            System.out.println("NO");
            return;
        }

        int remainingSets = (n+k-1)/k;

        if(remainingSets % 2 == 0){
            nextTimeA += remainingSets/2*t;
            System.out.println(nextTimeA<currTime ? "YES" : "NO");
        }else{
            nextTimeB += (remainingSets+1)/2*t;
            System.out.println(nextTimeB<currTime?"YES":"NO");
        }

    }
}