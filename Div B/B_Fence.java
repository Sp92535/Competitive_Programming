import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Fence {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String[] st = br.readLine().split(" ");

        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);

        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long sum = 0, minSum = 0 ,ans = 0;
        int x = 0;
        
        while(x<k) sum += num[x++];

        minSum = sum;
        ans = x-k;

        while(x<n){
            sum -= num[x-k];
            sum += num[x++];
            if(sum<minSum){
                minSum = sum;
                ans = x-k;
            }
        }

        System.out.println(ans+1);
    }
}