import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Launch_of_Collider {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] ch = br.readLine().toCharArray();
        int[] cor = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            if(ch[i]=='L' && ch[i-1]=='R'){
                min = Math.min(min,(cor[i]-cor[i-1])/2);
            }
        }
        System.out.println(min==Integer.MAX_VALUE ? -1 : min);
    }
}