import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class B_Physics_Practical {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            int n = Integer.parseInt(br.readLine());

            int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Arrays.sort(arr);

            int ans = 0;
                    
            for(int i=0; i<n; i++){
                int l = i, r = n-1;
                int x = i;
                while(l <= r){

                    int mid = (l+r)/2;

                    if(arr[mid] > arr[i]*2){
                        r = mid - 1;
                    }else{
                        x = mid;
                        l = mid + 1;
                    }
                }

                ans = Math.max(ans, x - i + 1);
            }


            bw.write(String.valueOf(n - ans));
        } catch (IOException e) {

        }

    }
}