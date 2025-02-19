import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C_Soldier_and_Cards {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Queue<Integer> a = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();

        int k1 = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<k1; i++){
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int k2 = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<k2; i++){
            b.add(Integer.parseInt(st.nextToken()));
        }


        int fight = 0;
        while(!a.isEmpty() && !b.isEmpty()){

            int A  = a.poll();
            int B = b.poll();

            if(fight > 150){
                System.out.println(-1);
                return;
            }


            if(A > B){
                a.add(B);
                a.add(A);
            }else{
                b.add(A);
                b.add(B);
            }

            fight++;
        }
        int winner = a.isEmpty() ? 2 : 1;
        System.out.println(fight+" "+winner);

    }
}