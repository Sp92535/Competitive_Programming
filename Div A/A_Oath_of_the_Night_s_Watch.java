import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Oath_of_the_Night_s_Watch {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE, max = 0;

        for(int i : arr){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int count = 0;

        for(int i : arr) count += i==min || i==max ? 0 : 1;

        System.out.println(count);
    }
}