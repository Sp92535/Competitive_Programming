import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<4; i++){
           set.add(arr[i]);
        }
        
        System.out.println(4-set.size());
        
    }
}