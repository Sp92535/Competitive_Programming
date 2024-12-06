import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Colorful_Stones_Simplified_Edition {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        char[] ins = br.readLine().toCharArray();

        int n = ins.length, i = 0;
        int currPos = 0;

        while(i<n){
            if(ins[i]==ch[currPos]) currPos++;
            i++;
        }
        
        System.out.println(currPos+1);
    }
}