import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_I_O_U {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int amt = Integer.parseInt(st.nextToken());
            
           arr[from] -= amt;
           arr[to] += amt;
        }
        
        int ans = 0;

        for(int i : arr) if(i>0) ans+=i;

        System.out.println(ans);
    }
}