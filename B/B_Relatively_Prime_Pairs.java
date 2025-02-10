import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Relatively_Prime_Pairs {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long l = Long.parseLong(st.nextToken());
        long r = Long.parseLong(st.nextToken());

        System.out.println("YES");
        for(long i=l; i<=r; i+=2L){
            System.out.println(i+" "+(i+1L));
        }
    }
}