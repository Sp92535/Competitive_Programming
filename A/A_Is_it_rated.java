import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Is_it_rated {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int flag = 0;
        int prev = 5000;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
        
            int curr = Integer.parseInt(st.nextToken());
            int chng = Integer.parseInt(st.nextToken());
        
            if(prev < curr && flag == 0){
                flag = 2;
            }

            if(chng!=curr){
                flag = 1;
            }
            prev = curr;
        }
        System.out.println(flag==1?"rated":flag==2?"unrated":"maybe");
    }
}