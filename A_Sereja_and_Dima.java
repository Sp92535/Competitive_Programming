import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_Sereja_and_Dima {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    
        int x = 0, y = n-1;
        int a = 0, b = 0;
        boolean serr = true;
        for(int i=n-1; i>=0; i--){
            if(arr[x] > arr[y]){
                if(serr){
                    a += arr[x];
                    serr = false;
                }else{
                    b += arr[x];
                    serr = true; 
                }
                x++;
            }else{
                if(serr){
                    a += arr[y];
                    serr = false;
                }else{
                    b += arr[y];
                    serr = true; 
                }
                y--;
            }
        }
        System.out.println(a+" "+b);
    }
}