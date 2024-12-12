import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Dubstep {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("WUB");

        for(String s : str){
            if(!s.equals(""))
                System.out.print(s+" ");
        }

    }
}