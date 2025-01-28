import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Sea_and_Islands {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int upp = (n+1)/2;
        int low = n/2;

        int max = upp*upp + low*low;

        if(k > max){
            System.out.println("NO");
            return;
        }

        char[][] ch = new char[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(ch[i],'S');

            for(int j = i%2; j<n && k > 0; j+=2, k--){

                ch[i][j] = 'L';
            }

        }
        System.out.println("YES");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
}