import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Caisa_and_Pylons {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int ans = arr[0];
        int curr = 0;
        

        for(int i=1; i<n; i++){
            curr += arr[i-1]-arr[i];
            if(curr < 0){
                ans += -curr;
                curr = 0;
            }
        }
        
        System.out.println(ans);
    }
}