import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Snacktower {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean[] arrived = new boolean[n];        

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = n-1;
        for(int i=0; i<n; i++){
            int curr =Integer.parseInt(st.nextToken());
            arrived[curr-1] = true;
            while (x>=0 && arrived[x]) {
                System.out.print(x+1+" ");
                x--;
            }
            System.out.println();
        }
    }
}