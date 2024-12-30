import java.io.IOException;
import java.util.Scanner;

public class A_Olesya_and_Rodion {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        if(n==1 && t>9){
            System.out.println(-1);
        }else{
            System.out.print(t%10 + t/10);
            for(int i=0; i<n-1; i++) System.out.print("0");
        }

        sc.close();
    }
}