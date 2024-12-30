import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Buy_a_Shovel {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int ans = 10;
        for(int i=1; i<10; i++){
            int change = (k*i)%10;
            if(change==0 || change==r){
                ans = i;
                break;
            }
        }

        System.out.println(ans);

    }
}