import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Black_Square {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int[] cal = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] idx = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int tot = 0;
        for(int i : idx){
            tot += cal[i-1];
        }
        System.out.println(tot);
    }
}