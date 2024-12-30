import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Dice_Tower {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){

            String[] st = br.readLine().split(" ");

            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);

            if(k==a || k==b || k==7-a || k==7-b){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}