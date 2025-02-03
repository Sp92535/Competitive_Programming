import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.List;

public class B_Jeff_and_Periods {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer,List<Integer>> seq = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            
            if(!seq.containsKey(x)) seq.put(x, new ArrayList<>());

            seq.get(x).add(i);
        }

        List<int[]> ans = new ArrayList<>();

        for(int key : seq.keySet()){

            List<Integer> sequence = seq.get(key);

            if(sequence.size()==1){
                ans.add(new int[]{key,0});
                continue;
            }

            int d = sequence.get(1) - sequence.get(0);
            
            boolean flag = true;

            for(int i=1; i<sequence.size()-1; i++){
                if(sequence.get(i+1) - sequence.get(i) != d){
                    flag = false;
                    break;
                }
            }

            if(flag){
                ans.add(new int[]{key,d});
            }
        }

        Collections.sort(ans,(a,b)->a[0]-b[0]);
        System.out.println(ans.size());
        for(int[] ar : ans){
            System.out.println(ar[0]+" "+ar[1]);
        }

    }
}