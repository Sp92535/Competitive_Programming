import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Inna_and_New_Matrix_of_Candies {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            int g = -1, s = -1;
            for(int j=0; j<m; j++){
                if(ch[j]=='G') g = j;
                else if(ch[j]=='S') s = j;
            }
            if(s<g){
                System.out.println(-1);
                return;
            }
            set.add(s-g);
        }
        System.out.println(set.size());
    }
}