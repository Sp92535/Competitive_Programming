import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Pangram {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n<26){
            System.out.println("NO");
            return;
        }
        boolean[] vis = new boolean[26];
        int count = 0;

        char[] ch = br.readLine().toLowerCase().toCharArray();

        for(char c : ch){
            int asc = c - 'a';
            if(!vis[asc]) count++;
            vis[asc] = true;
        }
        System.out.println(count==26?"YES":"NO");
    }
}