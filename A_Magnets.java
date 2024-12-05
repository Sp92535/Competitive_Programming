import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Magnets {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = br.readLine();
        }

        int grp = 1;

        for(int i=1; i<n; i++){
            if(!str[i].equals(str[i-1])) grp++;
        }
        System.out.print(grp);
    }
}