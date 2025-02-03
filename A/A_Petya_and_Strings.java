import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Petya_and_Strings {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = br.readLine().compareToIgnoreCase(br.readLine());
        System.out.print(ans==0?0 : ans < 0 ? -1 : 1);
    }
}