import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Snow_Footprints {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        char[] ch = br.readLine().toCharArray();

        int i = 0;
        while(ch[i] == '.'){
            i++;
        }
        int a = i+1;
        char c = ch[i];

        while (ch[i] == c) {
            i++;
        }

        int b = 0;
        if(c=='L'){
            b = a-1;
            a = i;
        }else{
            b = ch[i]=='.' ? i+1:i;
        }
        

        System.out.println(a+" "+b);
    }
}