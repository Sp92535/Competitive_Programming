import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Two_Buttons {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        System.out.println(getMin(a, b));
    }
    private static int getMin(int n, int m){
        if(m <= n) return n-m;
        return getMin(n, (m+1)/2) + 1 + (m+1)/2 - m/2;
    }
}