import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Boy_or_Girl {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        boolean[] set = new boolean[26];
        
        boolean odd = false;

        for(char c : ch){
            if(!set[c-'a']) odd = !odd;
            set[c-'a'] = true;
        }
        System.out.println(odd ? "IGNORE HIM!":"CHAT WITH HER!");
    }
}