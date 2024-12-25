import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Good_Number {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int count = 0;
        
        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            boolean[] vis = new boolean[k+1];
            int z = k+1;
            for(char c : ch){
                int num = c - '0';
                if(num > k) continue;
                if(!vis[num]){
                    z--;
                    vis[num] = true;
                }
            }

            if(z==0) count++;
        }
        System.out.println(count);

    }
}