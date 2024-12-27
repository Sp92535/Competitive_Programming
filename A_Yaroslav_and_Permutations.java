import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A_Yaroslav_and_Permutations {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ch = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int i: ch){
            freq.put(i, freq.getOrDefault(i, 0)+1);
            if(freq.get(i) > (n+1)/2){
                System.out.println("NO");
                return;
            }
        }
        

        System.out.println("YES");
    }
}