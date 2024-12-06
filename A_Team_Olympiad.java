import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_Team_Olympiad {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int x = 0, y = 0, z = 0;
        List<Integer> team = new ArrayList<>();
        while(x<n && y<n && z<n){

            while(x<n && arr[x]!=1) x++;
            while(y<n && arr[y]!=2) y++;
            while(z<n && arr[z]!=3) z++;

            if(x<n && y<n && z<n){
                Collections.addAll(team,x+1,y+1,z+1);
            }

            x++;
            y++;
            z++;
        }
        int tot = team.size()/3;
        int k = 0;
        System.out.println(tot);
        while(k<team.size()){
            System.out.println(team.get(k)+" "+team.get(k+1)+" "+team.get(k+2));
            k+=3;
        }
    }
}