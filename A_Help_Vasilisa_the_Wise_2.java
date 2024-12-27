import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Help_Vasilisa_the_Wise_2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] d = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int a = (d[0] - r[1] + c[0])/2;
        int b = c[0] - a;
        int m = r[0] - a;
        int n = d[0] - a;

        if(a<=0 || b<=0 || m<=0 || n<=0 || a>9 || b>9 || m>9 || n>9 || a==b || b==m || m==n || a==n || a==m || b==n){
            System.out.println(-1);
            return;
        }

        System.out.println(a+" "+m);
        System.out.println(b+" "+n);
    }
}