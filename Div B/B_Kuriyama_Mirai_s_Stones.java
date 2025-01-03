import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Kuriyama_Mirai_s_Stones {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());

        long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] sorted = arr.clone();

        Arrays.sort(sorted);

        for(int i=1; i<n; i++){
            arr[i] += arr[i-1];
            sorted[i] += sorted[i-1];
        }

        int m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int type = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if(type==1){
                System.out.println(l>1 ? arr[r-1]-arr[l-2] : arr[r-1]);
            }else{
                System.out.println(l>1 ? sorted[r-1]-sorted[l-2] : sorted[r-1]);                
            }
        }
    }
}