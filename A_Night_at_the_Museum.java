import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Night_at_the_Museum {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();

        char curr = 'a';
        int rot = 0;
        for(char c : ch){
            
            int sideA = Math.abs(c - curr);
            int sideB = 26 - sideA;
            
            rot += Math.min(sideA, sideB);
            curr = c;
        }

        System.out.println(rot);
    }
}