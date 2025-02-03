import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Sum_of_Digits {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        int spell = 0;
        while(num.length() > 1){
            int sum = 0;

            for(char c : num.toCharArray()){
                sum += (c-'0');
            }
            spell++;
            num = String.valueOf(sum);
        }

        System.out.println(spell);
    }
}