import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Lovely_Palindromes {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String str = br.readLine();

        System.out.println(str+new StringBuilder().append(str).reverse().toString());
    }
}