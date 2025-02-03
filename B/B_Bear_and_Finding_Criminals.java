import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Bear_and_Finding_Criminals {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");
        
        int n = Integer.parseInt(first[0]);
        int k = Integer.parseInt(first[1]);
    
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int i,j;
        i=j=k-1;

        int ans = arr[i];


        while(i>0 && j<n-1){
            --i;
            ++j;
            ans += arr[i]==1 && arr[j]==1 ? 2 : 0;    
        }
        while(i>0){
            ans += arr[--i];
        }
        while(j<n-1){
            ans += arr[++j];
        }

        System.out.println(ans);
    }
}