import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_Vacations {

    private static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] gym = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] con = new int[n];

        for(int i=0; i<n; i++){
            switch(gym[i]){
                case 1 -> {
                    gym[i] = 0;
                    con[i] = 1;
                }
                case 2 -> {
                    gym[i] = 1;
                    con[i] = 0;
                }
                case 3 -> {
                    gym[i] = 1;
                    con[i] = 1;
                }
                default -> {
                    con[i] = 0;
                }
            }
        }
        
        Integer dp[][] = new Integer[n][3];

        int currMin = getMin(gym, con, dp, 0, 0);    
        currMin = Math.min(currMin,getMin(gym, con, dp, 0, 1));
        currMin = Math.min(currMin,getMin(gym, con, dp, 0, 2));

        System.out.println(currMin);
    }
    private static int getMin(int[] gym, int[] con, Integer[][] dp, int level, int action){
        if(level==gym.length) return 0;

        if(dp[level][action]!=null) return dp[level][action];

        if(action==0 && gym[level]!=0 && con[level]!=0) return dp[level][action] = MAX;
        if(action==1 && gym[level]!=1) return dp[level][action] = MAX;
        if(action==2 && con[level]!=1) return dp[level][action] = MAX;


        int currMin = getMin(gym, con, dp, level+1, 0);
        
        if(action!=1)
            currMin = Math.min(currMin,getMin(gym, con, dp, level+1, 1));
        if(action!=2)
            currMin = Math.min(currMin,getMin(gym, con, dp, level+1, 2));
        

        return dp[level][action] = currMin + (action==0 && currMin!=MAX? 1 : 0);
    }
}