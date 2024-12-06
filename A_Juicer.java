import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Juicer {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), limit = Integer.parseInt(st.nextToken()), empty = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int ans = 0, waste = 0;
        for(int i=0; i<n; i++){
            int curr = Integer.parseInt(st.nextToken());

            if(curr > limit) continue;
            waste += curr;

            if(waste > empty){
                waste = 0;
                ans++;
            }
        }

        System.out.println(ans);
    }
}