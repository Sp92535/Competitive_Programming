import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Hopscotch {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);

        if(y%a==0){
            System.out.println(-1);
            return;
        }
        
        int z = y/a;
        double boundary = a/2.0;

        if(z==0){
            if(x >= boundary || x <= -boundary){
                System.out.println(-1);
            }else{
                System.out.println(1);
            }
            return;
        }

        int first = z + (z+1)/2;

        if(z%2==0){

            int second = first + 1;

            if(x >= a || x <= -a || x==0){
                System.out.println(-1);
            }else if(x < 0){
                System.out.println(first);
            }else{
                System.out.println(second);
            }

        }else{

            if(x >= boundary || x <= -boundary){
                System.out.println(-1);
            }else{
                System.out.println(first);
            }
        }

    }
}