import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_Growing_Mushrooms {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        double t1 = Double.parseDouble(st.nextToken());
        double t2 = Double.parseDouble(st.nextToken());
        double k = Double.parseDouble(st.nextToken());


        Queue<double[]> pq = new PriorityQueue<>((a,b)->{
            int x = Double.compare(b[1],a[1]);
            if(x==0){
                return Double.compare(a[0],b[0]);
            }
            return x;
        });

        for(int i=0; i<n; i++){

            st = new StringTokenizer(br.readLine());

            double u = Double.parseDouble(st.nextToken());
            double v = Double.parseDouble(st.nextToken());

            double max_d = 0, curr;

            curr = t1*u;
            curr = curr - (curr*k/100.0) + t2*v;

            max_d = curr;

            curr = t1*v;
            curr = curr - (curr*k/100.0) + t2*u;

            max_d = Math.max(max_d,curr);

            pq.add(new double[]{i+1,max_d});
        }

        while (!pq.isEmpty()) {
            double[] can = pq.poll();

            System.out.println((int)can[0]+" "+String.format("%.2f", can[1]));
        }

    }
}