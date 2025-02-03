import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Coins {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = {0,0,0};
        
        for(int i=0; i<3; i++){
            char[] ch = br.readLine().toCharArray();
            
            if(ch[1]=='>'){
                arr[ch[0]-'A']++;
            }else{
                arr[ch[2]-'A']++;
            }
        }

        char[] ans = {'0','0','0'};
        int z = 0;
        for(int i : arr){
            if(ans[i]!='0') {
                System.out.println("Impossible");
                return;
            }
            ans[i] = (char)(z+'A');
            z++;
        }

        System.out.println(new String(ans));

    }
}