import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Lineland_Mail {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(Math.abs(arr[0]-arr[1])+" "+Math.abs(arr[0]-arr[n-1]));
        for(int i=1; i<n-1; i++){
            int min = Math.min(Math.abs(arr[i-1]-arr[i]),Math.abs(arr[i+1]-arr[i]));
            int max = Math.max(Math.abs(arr[0]-arr[i]),Math.abs(arr[n-1]-arr[i]));            
            System.out.println(min+" "+max);
        }
        System.out.println(Math.abs(arr[n-1]-arr[n-2])+" "+Math.abs(arr[0]-arr[n-1]));
    }
}