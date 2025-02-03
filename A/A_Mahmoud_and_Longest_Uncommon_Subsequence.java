import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Mahmoud_and_Longest_Uncommon_Subsequence {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(), b = br.readLine();
        System.out.println(a.equals(b) ? -1 : Math.max(a.length(), b.length()));
    }
}