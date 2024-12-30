import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_Team {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][];

        for(int i=0; i<n; i++){
            arr[i] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(solve(n, arr));
    }
    private static int solve(int n, int[][] arr){
        int ans = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int s : arr[i]){
                sum += s; 
            }
            if(sum > 1) ans++;
        }
        return ans;
    }
}