import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Effective_Approach {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] seq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] vasya = new int[n+1];
        int[] petya = new int[n+1];

        for(int i=0; i<n; i++){
            int a = seq[i];
            vasya[a] = i+1;
            petya[a] = n-i;
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long vas = 0, pet = 0;
        for(int i=0; i<m; i++){
            int b = Integer.parseInt(st.nextToken());
            vas += vasya[b];
            pet += petya[b];
        }

        System.out.println(vas+" "+pet);
    }
}