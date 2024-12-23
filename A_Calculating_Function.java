import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Calculating_Function {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long x = n/2;
        long y = (n+1)/2;

        System.out.println(x*x + x - y*y);
    }
}