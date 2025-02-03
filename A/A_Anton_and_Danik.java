import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Anton_and_Danik {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        char[] ch = br.readLine().toCharArray();

        System.out.print(solve(ch));
    }

    private static String solve(char[] ch){
        int a = 0;

        for(char c : ch){
            a += c=='A' ? 1 : -1;
        }
        
        return a > 0 ? "Anton" : a < 0 ? "Danik" :"Friendship";
    }
}