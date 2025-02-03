import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_Shaass_and_Oskols {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] wire = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

            int right = wire[w-1] - b, left = b-1;
            wire[w-1] = 0;
            if(w-2 >= 0) wire[w-2] += left;
            if(w < n) wire[w] += right;
        }

        for(int i : wire) System.out.println(i);
    }
}