import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Anton_and_Letters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] vis = new boolean[26];

        char[] ch = br.readLine().toCharArray();
        int tot = 0;
        for(char c : ch){
            int asc = c-'a';
            if(asc>=0 && asc<='z'-'a' && !vis[asc]){
                vis[asc] = true;
                tot++;
            }
        }
        System.out.println(tot);
    }
}