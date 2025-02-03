import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Bear_and_Strings {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] ch = br.readLine().toCharArray();

        int n = ch.length, i = 0;

        int an = 0, e = -1;

        while(i <= n-4){
            if(ch[i]=='b' && ch[i+1]=='e' && ch[i+2]=='a' && ch[i+3]=='r'){
                an += (i-e)*(n-(i+3));
                e = i;
            }
            i++;
        }

        System.out.println(an);

    }
}