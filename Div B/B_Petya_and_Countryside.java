import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Petya_and_Countryside {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] l = new int[n];
        int[] r = new int[n];

        for(int i=1; i<n; i++){
            if(arr[i] >= arr[i-1]) l[i] = l[i-1] + 1;
        }
        int max = 1;
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= arr[i+1]) r[i] = r[i+1] + 1;
        }

        for(int i=0; i<n; i++){
            max = Math.max(max, l[i]+r[i]+1);
        }
        
        System.out.println(max);
    }
}