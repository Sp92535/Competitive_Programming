import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Die_Roll {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        int dot = 6 - Math.max(a, b) + 1;
        
        System.out.println(switch(dot){
            case 0 -> "0/1";
            case 1 -> "1/6";
            case 2 -> "1/3";
            case 3 -> "1/2";
            case 4 -> "2/3";
            case 5 -> "5/6";
            default -> "1/1";
        });

    }
}