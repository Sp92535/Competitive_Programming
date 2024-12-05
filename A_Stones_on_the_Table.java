import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Stones_on_the_Table {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] ch = br.readLine().toCharArray();

        int count = 0;
        for(int i=1; i < n; i++){
            if(ch[i]==ch[i-1]) count++;
        }
        System.out.println(count);
    }
}