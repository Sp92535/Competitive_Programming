import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Beautiful_Matrix {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++){
            String[] str = br.readLine().split("\\s+");
            for(int j=0; j<5; j++){
                if(str[j].equals("1")){
                    System.out.print(Math.abs(2-i)+Math.abs(2-j));
                    return;                    
                }
            }
        }
    }
}