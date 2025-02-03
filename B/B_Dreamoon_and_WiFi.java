import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Dreamoon_and_WiFi {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        char[] drazil = br.readLine().toCharArray();
        char[] dreamoon = br.readLine().toCharArray();
        int[][] sum = new int[11][2];

        int target = 0;
        for(char c : drazil){
            if(c=='+') target++;
            else target--;
        }

        dive(sum, dreamoon, 0, 0);
        int tot = 0;
        for(int i=0; i<11; i++){
            tot += sum[i][0];
            tot += sum[i][1];
        }

        double prob = sum[Math.abs(target)][target < 0 ? 1 : 0]/(double)tot;

        System.out.println(String.format("%.12f", prob));
    }
    private static void dive(int[][] sum, char[] dreamoon ,int pos, int currSum){
        if(pos==dreamoon.length){
            int sign = 0;
            if(currSum < 0){
                sign = 1;
                currSum *= -1;
            }
            sum[currSum][sign]++;
            return;
        }

        if(dreamoon[pos]=='+'){
            dive(sum, dreamoon, pos+1, currSum+1);
        }else if(dreamoon[pos]=='-'){
            dive(sum, dreamoon, pos+1, currSum-1);
        }else{
            dive(sum, dreamoon, pos+1, currSum+1);
            dive(sum, dreamoon, pos+1, currSum-1);
        }
    }
}