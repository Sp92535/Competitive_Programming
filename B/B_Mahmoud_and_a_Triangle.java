import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Mahmoud_and_a_Triangle {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(arr);

        for(int i=2; i<n; i++){
            if(arr[i] < arr[i-1]+arr[i-2]){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}