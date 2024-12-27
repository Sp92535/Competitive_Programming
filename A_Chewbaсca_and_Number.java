import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Chewbaсca_and_Number {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        boolean zero = false;
        for(int i=0; i<ch.length; i++){
            int num = ch[i] - '0';
            int rev = 9 - num;
            
            if(rev < num && (rev!=0 || zero)){
                ch[i] = (char)(rev+'0');
            }else
                zero = true;
        }
        System.out.println(new String(ch));
    }
}