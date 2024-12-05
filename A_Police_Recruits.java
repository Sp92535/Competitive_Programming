import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Police_Recruits {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        int arr[] = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int free = 0, ign = 0;

        for(int i : arr){
            if(i > 0) free+=i;
            else if(i==-1 && free > 0) free--;
            else ign++;
        }
        System.out.println(ign);
    }
}