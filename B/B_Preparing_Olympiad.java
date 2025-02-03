import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Preparing_Olympiad {

    private static int n, l, r, x, count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        l = Integer.parseInt(str[1]);
        r = Integer.parseInt(str[2]);
        x = Integer.parseInt(str[3]);
        count = 0;

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dfs(arr, 0, 0L, 0, Integer.MAX_VALUE);

        System.out.println(count);

    }

    private static void dfs(int[] arr, int pos, long sum, int max, int min){
        if(pos==n || sum > r){
            if(sum >= l && sum <= r && max-min >= x){
                count++;
            }
            return;
        }

        dfs(arr, pos+1, sum+arr[pos], Math.max(max,arr[pos]), Math.min(min,arr[pos]));
        dfs(arr, pos+1, sum, max, min);
    }
}