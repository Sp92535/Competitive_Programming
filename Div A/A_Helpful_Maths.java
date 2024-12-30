import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Helpful_Maths {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = Arrays.stream(br.readLine().split("\\+")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        System.out.print(arr[0]);

        for(int i=1;i<arr.length ;i++){
            System.out.print("+"+arr[i]);
        }
        
    }
}