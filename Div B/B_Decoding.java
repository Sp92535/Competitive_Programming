import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Decoding {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] ch = br.readLine().toCharArray();
        char[] ans = new char[n];

        boolean even = n%2==0;
        int idx = (n-1)/2;

        for(int i=1; i<=n; i++){
            ans[idx] = ch[i-1];
            if(even){
                idx += i;
                even = false;
            }else{
                idx -= i;
                even = true;
            }
        }

        System.out.println(new String(ans));
    }
}