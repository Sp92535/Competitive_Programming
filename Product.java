import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(br.ready()){
            char[] a = br.readLine().toCharArray();
            char[] b = br.readLine().toCharArray();

            int[] A = new int[a.length], B = new int[b.length];

            for(int i=a.length-1; i>=0; i--) A[i] = a[a.length - 1 - i] - '0';
            for(int i=b.length-1; i>=0; i--) B[i] = b[b.length - 1 - i] - '0';
            
            multipy(A,B);

        }
    }
    private static void multipy(int[] x, int[] y){
        int[] res = new int[x.length + y.length];
        
        for(int i=0; i<y.length; i++){
            int z = i;
            for(int j=0; j<x.length; j++){
                res[z++] += y[i]*x[j]; 
            }
        }

        int c = 0;
        for(int i=0; i<res.length; i++){
            res[i] += c;
            c = res[i]/10;
            res[i] %= 10;
        }

        int l = res.length-1;

        while (l>=0 && res[l]==0) {
            l--;
        }

        if(l<0) System.out.println(0);
        else for(int i=l; i>=0; i--) System.out.print(res[i]);
    }


}