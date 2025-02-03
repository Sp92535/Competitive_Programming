import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class B_President_s_Office {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String[] st = br.readLine().split(" ");
    
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        char pres = st[2].charAt(0);

        char[][] ch = new char[n][];

        for(int i=0; i<n; i++){
            ch[i] = br.readLine().toCharArray();
        }

        Set<Character> dep = new HashSet<>();


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(ch[i][j]==pres){
                    if(i>0) dep.add(ch[i-1][j]);
                    if(j>0) dep.add(ch[i][j-1]);
                    if(i<n-1) dep.add(ch[i+1][j]);
                    if(j<m-1) dep.add(ch[i][j+1]);
                }
            }
        }

        dep.remove(pres);
        dep.remove('.');

        System.out.println(dep.size());

    }
}