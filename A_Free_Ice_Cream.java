import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Free_Ice_Cream {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        long dis = 0;
        for(long i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            long mul = st.nextToken().equals("-") ? -1 : 1;
            
            long req = Long.parseLong(st.nextToken());

            if(req>x && mul==-1) dis++;
            else x += req*mul;
        }
        System.out.println(x+" "+dis);
    }
}