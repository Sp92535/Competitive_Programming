import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Bear_and_Big_Brother {

    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a =Integer.parseInt(st.nextToken()), b =Integer.parseInt(st.nextToken());

        System.out.println(solve(a, b));

    }

    private static int solve(int a , int b){
        int an = 0;
        while(a<=b){
            a *= 3;
            b *= 2;
            an++;
        }
        return an;
    }
}