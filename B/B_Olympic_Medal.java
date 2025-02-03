import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Olympic_Medal {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int r1 = 0;

        for(int i=0; i<n; i++){
            r1 = Math.max(r1,Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        int[] p1 = new int[m];
        for(int i=0; i<m; i++){
            p1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        int p2 = Integer.MAX_VALUE;
        
        for(int i=0; i<k; i++){
            p2 = Math.min(p2,Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        double r2 = 0;

        for(int i=0; i<m; i++){
            double eq = (b*p1[i])/(double)(a*p2+b*p1[i]);
            
            eq = Math.sqrt(eq)*r1;
            
            r2 = Math.max(r2,eq);
        }

        System.out.println(r2);
    }
}