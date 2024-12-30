import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Burglar_and_Matches {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[m][2];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        }

        Arrays.sort(arr,(a,b)->b[1]-a[1]);

        long ans = 0;
        int box = n, i = 0;

        while(box > 0 && i<m){
            int rob = Math.min(arr[i][0],box);
            ans += 1L*rob*arr[i++][1]; 
            box -= rob;
        }
        System.out.println(ans);
    }
}