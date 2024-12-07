import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Twins {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int sum = 0;
        for(int i : arr) sum+=i;

        int mySum = 0, coins = 0;
        for(int i=n-1; i>=0; i--){
            mySum += arr[i];
            sum -= arr[i];
            coins++;
            if(mySum > sum) break;
        }

        System.out.println(coins);
    }
}