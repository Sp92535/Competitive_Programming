import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Balanced_Rating_Changes {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] b = new long[n];
        boolean[] odd = new boolean[n];
        
        long sum=0;

        for(int i=0; i<n; i++){
            b[i] = Long.parseLong(br.readLine());
            odd[i] = b[i]%2!=0;
            sum += b[i]/2;
        }
        
        for(int i=0; i<n; i++){
            if(!odd[i]){
                b[i]/=2;
                continue;
            }    

            if(sum > 0 && b[i] < 0){
                sum--;
                b[i]/=2;
                b[i]--;
            }else if(sum < 0 && b[i] > 0){
                sum++;
                b[i]/=2;
                b[i]++;
            }else{
                b[i]/=2;
            }
        }
        print(b);
    }
    private static void print(long[] arr){
        for(long i : arr) System.out.println(i);
    }
}