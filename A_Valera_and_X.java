import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Valera_and_X {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] ch = new char[n][];

        for(int i=0; i<n; i++){
            ch[i] = br.readLine().toCharArray();
        }

        for(int i=1, j=1; i<n; i++, j++){
            if(ch[i][j]!=ch[0][0]){
                System.out.println("NO");
                return;
            }
        }

        for(int i=0, j=n-1; i<n; i++, j--){
            if(ch[i][j]!=ch[0][0]){
                System.out.println("NO");
                return;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && i!=n-1-j && (ch[i][j]!=ch[0][1] || ch[i][j]==ch[0][0])){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");

    }
}