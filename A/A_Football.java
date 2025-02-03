import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Football {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String a = null, b = null;
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            
            String curr = br.readLine();

            if(a==null){
                a = curr;
            }else if(b==null && !a.equals(curr)){
                b = curr;
            }   
            if(a.equals(curr)) cnt++;         
        }
        System.out.println(cnt > (n/2) ? a : b);
        
    }
}