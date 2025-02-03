import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_Sort_the_Array {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int x = 1, y = 1;
        boolean found  = false;

        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                if(!found) x = i;
                y = i+1;
                found = true;
            }else if(found){
                break;
            }
        }
        
        reverse(arr,x-1,y-1);

        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
        System.out.println(x+" "+y);
    }
    private static void reverse(int[] arr, int x, int y){
        while (x<y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            
            x++;
            y--;
        }
    }
}