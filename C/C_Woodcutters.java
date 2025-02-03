import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C_Woodcutters {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<long[]> fall = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        
        long[][] arr = new long[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }

        fall.add(new long[]{arr[0][0],arr[0][1],-1});
        
        for(int i=1; i<n-1; i++){
            
            boolean left = arr[i][0]-arr[i][1] > arr[i-1][0];
            boolean right = arr[i][0]+arr[i][1] < arr[i+1][0];
            
            if(left && right){
                fall.add(new long[]{arr[i][0],arr[i][1],0});
            }else if(left){
                fall.add(new long[]{arr[i][0],arr[i][1],-1});
            }else if(right){
                fall.add(new long[]{arr[i][0],arr[i][1],1});
            }
        }
        if(n-1!=0)
            fall.add(new long[]{arr[n-1][0],arr[n-1][1],1});

        long not = 0;

        for(int i=1; i<fall.size()-1; i++){

            if(fall.get(i)[2]==1 && fall.get(i+1)[2]!=1){
                long currEnd = fall.get(i)[0] + fall.get(i)[1];
                long nextEnd = fall.get(i+1)[0] - fall.get(i+1)[1];

                if(currEnd < nextEnd) continue;
                
                if(fall.get(i+1)[2]==0){
                    fall.get(i+1)[2] = 1;
                }else{
                    not++;
                }
            }
        }


        System.out.println(fall.size()-not);

    }
}