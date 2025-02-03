import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Mountain_Scenery {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int k = Integer.parseInt(st[1]);
        
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for(int i=1; i<arr.length && k>0; i+=2){
            if(arr[i]-1>arr[i-1] && arr[i]-1>arr[i+1]){
                arr[i]--;
                k--;
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}