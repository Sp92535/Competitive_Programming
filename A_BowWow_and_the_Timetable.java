import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_BowWow_and_the_Timetable {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        int len = ch.length;

        int ans = len/2;
        boolean flag = false;
        for(int i=1; i<len; i++){
            flag |= ch[i]=='1';
        }
        ans += len%2!=0 && flag ? 1 : 0; 

        System.out.println(ans);
    }
}