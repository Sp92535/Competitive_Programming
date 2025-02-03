import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Roma_and_Changing_Signs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int neg = 0;
        int mark = n;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 || neg==k) {
                mark = i;
                break;
            }
            neg++;
        }

        k -= neg;
        k%=2;
        
        if(k == 1)
        if(mark > 0 && mark < n &&arr[mark] > -arr[mark-1])
            arr[mark-1] *= -1;
        else if(mark<n)
            arr[mark] *= -1;
        else
            arr[mark-1] *= -1;
        

        for(int i=0; i<mark; i++){
            max += -arr[i];
        }
        
        for(int i=mark; i<n; i++){
            max += arr[i];
        }

        System.out.println(max);
    }
}