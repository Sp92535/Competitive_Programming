import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Filya_and_Homework {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();
        int z = 0;
        int[] arr = new int[3];

        for(int i=0; i<n; i++){
            int el = Integer.parseInt(st.nextToken());
            if(set.add(el) && z<3){
                arr[z++] = el;
            }
        }

        if(set.size() > 3){
            System.out.println("NO");
            return;
        }
        if(set.size() < 3){
            System.out.println("YES");
            return;
        }
        Arrays.sort(arr);

        if((arr[2]-arr[0])%2==0 && arr[1]-arr[0]==arr[2]-arr[1]){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}