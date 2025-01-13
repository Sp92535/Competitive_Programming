import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Steps {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        
        
        long k = Long.parseLong(br.readLine());
        
        long steps = 0;

        for(long i=0 ;i<k; i++){

            st = new StringTokenizer(br.readLine());

            long dx = Long.parseLong(st.nextToken());
            long dy = Long.parseLong(st.nextToken());
        

            long x_max = Integer.MAX_VALUE;
            long y_max = Integer.MAX_VALUE;

            if(dx > 0){
                x_max = (n-x)/dx;
            }else if(dx < 0){
                x_max = (x-1)/(-dx);
            }

            if(dy > 0){
                y_max = (m-y)/dy;    
            }else if(dy < 0){
                y_max = (y-1)/(-dy);    
            }

            long z_min = Math.min(x_max,y_max);

            x += z_min*dx;
            y += z_min*dy; 

            steps += z_min;
        }

        System.out.println(steps);
    }
}