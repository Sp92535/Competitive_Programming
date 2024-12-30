import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Arpa_s_hard_exam_and_Mehrdad_s_naive_cheat {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        if(n==0){
            System.out.println(1);
            return;
        }

        switch (n%4) {
            case 1 -> System.out.println(8);
            case 2 -> System.out.println(4);
            case 3 -> System.out.println(2);
            default -> System.out.println(6);
        }
    }
}