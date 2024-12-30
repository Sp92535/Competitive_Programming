import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Word {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] ch = str.toCharArray();

        int up = 0;

        for(char c : ch){
            int asc = c-'a';
            up += asc <= 25 && asc >= 0? -1: 1;
        }
        System.out.print(up > 0 ? str.toUpperCase():str.toLowerCase());
    }
}