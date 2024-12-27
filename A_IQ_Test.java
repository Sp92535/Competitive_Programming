import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_IQ_Test {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] ch = new char[4][];
        for(int i=0; i<4; i++){
            ch[i] = br.readLine().toCharArray();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int k = 0;
                k += ch[i][j]=='#' ? 1 : 0;
                k += ch[i+1][j]=='#' ? 1 : 0;
                k += ch[i][j+1]=='#' ? 1 : 0;
                k += ch[i+1][j+1]=='#' ? 1 : 0;
                if(k!=2){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}