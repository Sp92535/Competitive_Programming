import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Balanced_Tunnel {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> fined = new HashSet<>();   // also can use boolean[] since 1 <= curr <= n
        int i = 0;
        while (i < n) {
            if(fined.contains(arr[i])){
                i++;
                continue;
            }
            int curr = Integer.parseInt(st.nextToken());
            if(curr!=arr[i])
                fined.add(curr);
            else i++;
        }

        System.out.println(fined.size());
    }
}