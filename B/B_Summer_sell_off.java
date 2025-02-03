import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_Summer_sell_off {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        
        long[][] prod = new long[n][2];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            long extraA = Math.min(2*prod[a][0],prod[a][1]) - Math.min(prod[a][0],prod[a][1]);
            long extraB = Math.min(2*prod[b][0],prod[b][1]) - Math.min(prod[b][0],prod[b][1]);
            
            return Long.compare(extraB, extraA);
        });

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            
            prod[i][0] = Long.parseLong(st.nextToken());
            prod[i][1] = Long.parseLong(st.nextToken());
            
            pq.add(i);
        }

        for(int i=0; i<k; i++){
            int idx = pq.poll();
            prod[idx][0] *= 2;
        }
        long total = 0;
        for(int i=0; i<n ;i++){
            total += Math.min(prod[i][0],prod[i][1]);
        }

        System.out.println(total);
    }
}