import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Light_more_light {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            System.out.println(Math.pow(Math.sqrt(n), 2)==n?"yes":"no");
        }
    }
    
}