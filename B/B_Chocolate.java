import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Chocolate {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int pos = -1;
        long ans = 1;
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());

            if(x==1){
                if(pos!=-1){
                    ans *= i-pos;
                }
                pos = i;
            }

        }

        System.out.println(pos==-1 ? 0 :ans);

    }
}