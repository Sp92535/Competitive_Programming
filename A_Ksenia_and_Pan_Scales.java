import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Ksenia_and_Pan_Scales {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] ch = br.readLine().toCharArray();

        int x = 0;
        while(ch[x++]!='|');
        
        int left = x-1;
        int right = ch.length - x;

        char[] ext = br.readLine().toCharArray();

        int len = ext.length;
        int diff = Math.abs(left-right);

        int z = len - diff;

        if(z<0 || z%2!=0){
            System.out.println("Impossible");
            return;
        }
        
        int tot = ch.length + len;
        char[] ans = new char[tot];
        
        int y=0;
        int half = tot/2;

        int m = 0;
        while(y<left){
            ans[y++] = ch[m++];
        }
        int n = 0;
        while(y<half){
            ans[y++] = ext[n++];
        }
        
        ans[y++] = '|';

        while(m < ch.length-1){
            ans[y++] = ch[++m];
        }
        while (y<tot) {
            ans[y++] = ext[n++];
        }
        System.out.println(new String(ans));
    }
}