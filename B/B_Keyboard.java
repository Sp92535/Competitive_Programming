import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class B_Keyboard {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] dp = new int[26];
        Arrays.fill(dp, -1);

        @SuppressWarnings("unchecked")
        List<int[]>[] arr = new List[26];
        for(int i=0; i<26; i++) arr[i] = new ArrayList<>();

        List<int[]> shift = new ArrayList<>();

        for(int i=0 ;i<n; i++){
            char[] str = br.readLine().toCharArray();

            for(int j=0; j<m; j++){
                char ch = str[j];
            
                if(ch=='S'){
                    shift.add(new int[]{i,j});
                    continue;
                }

                arr[ch-'a'].add(new int[]{i,j});
            }
        }

        int len = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int time = 0;

        for(int i=0; i<len; i++){

            char ch = str[i];
            boolean isUpper = ch >= 'A' && ch <= 'Z';
            
            ch = Character.toLowerCase(ch);

            int idx = ch - 'a';
            
            if(arr[idx].size()==0 || (isUpper && shift.size()==0)){
                System.out.println(-1);
                return;
            }

            if(isUpper){
                if(dp[idx]==-1){
                    dp[idx] = canReach(shift,arr[idx],x);
                }
                time += dp[idx];    
            }
        }   

        System.out.println(time);
    }
    private static int canReach(List<int[]> shift, List<int[]> ch, int x){
        
        for(int[] pos : ch){
            for(int[] shi : shift){
                double dis = Math.sqrt(Math.pow(shi[0]-pos[0],2)+Math.pow(shi[1]-pos[1],2));
                if(dis<=x) return 0;
            }
        }
        return 1;
    }
}