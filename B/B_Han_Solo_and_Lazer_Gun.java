import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B_Han_Solo_and_Lazer_Gun {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        double x_0 = Double.parseDouble(st.nextToken());
        double y_0 = Double.parseDouble(st.nextToken());

        Set<Double> slopes = new HashSet<>();
        int inf = 0;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            double x_i = Double.parseDouble(st.nextToken());
            double y_i = Double.parseDouble(st.nextToken()); 

            if(x_i==x_0){
                inf = 1;
            }else{
                slopes.add((y_i-y_0)/(x_i-x_0));
            }
        }

        System.out.println(slopes.size() + inf);

    }
}