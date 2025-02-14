import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Little_Girl_and_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] freq = new int[26];

        for (char ch : br.readLine().toCharArray()) {
            freq[ch - 'a']++;
        }

        int odd = 0;

        for (int i : freq) {
            odd += i % 2;
        }

        if(odd==0){
            System.out.println("First");
            return;
        }

        if(odd%2==1){
            System.out.println("First");
        }else{
            System.out.println("Second");
        }

    }
}