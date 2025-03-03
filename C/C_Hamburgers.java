import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_Hamburgers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] requirement = new long[3];

        for (char c : br.readLine().toCharArray()) {
            if (c == 'B')
                requirement[0]++;
            if (c == 'S')
                requirement[1]++;
            if (c == 'C')
                requirement[2]++;
        }

        long[] available = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long[] price = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long budget = Long.parseLong(br.readLine());

        long burgers = 0;
        

        while(
            (available[0] != 0 && requirement[0]>0)|| 
            (available[1] != 0 && requirement[1]>0)||
            (available[2] != 0 && requirement[2]>0)
            ){
                
            available[0] -= requirement[0];
            if(available[0] < 0){
                budget -= -available[0]*price[0];
                available[0] = 0;
            }
            available[1] -= requirement[1];
            if(available[1] < 0){
                budget -= -available[1]*price[1];
                available[1] = 0;
            }
            available[2] -= requirement[2];
            if(available[2] < 0){
                budget -= -available[2]*price[2];
                available[2] = 0;
            }

            if(budget < 0){
                System.out.println(burgers);
                return;
            }
            burgers++;
        }
        

        long priceOfOne = price[0]*requirement[0] + price[1]*requirement[1] + price[2]*requirement[2];
        burgers += budget/priceOfOne;

        System.out.println(burgers);
    }
}