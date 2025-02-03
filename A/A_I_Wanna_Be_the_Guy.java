import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_I_Wanna_Be_the_Guy {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        boolean[] vis = new boolean[total+1];
        int count = 0;
        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();

            while (st.hasMoreTokens()) {
                int curr = Integer.parseInt(st.nextToken());
                if(!vis[curr]){
                    count++;
                    vis[curr] = true;
                }
            }
        }

        System.out.println(count==total?"I become the guy.":"Oh, my keyboard!");
    }
}