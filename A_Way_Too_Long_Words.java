import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Way_Too_Long_Words {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String str = br.readLine();
            int len = str.length();
            if(len>10)
            System.out.println(str.charAt(0)+""+(len-2)+""+str.charAt(len-1));
            else
            System.out.println(str);
        }
    }
}