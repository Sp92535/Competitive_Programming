import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Escape {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double vp = Double.parseDouble(br.readLine());
        double vd = Double.parseDouble(br.readLine());
        double t = Double.parseDouble(br.readLine());
        double f = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());


        if(vp >= vd){
            System.out.println(0);  
            return;
        }

        double Treq = c/vp;


        double Tp = t;
        double Td = vp*Tp/(vd-vp);
        Tp += Td;

        int tot = 0;

        while(Tp < Treq){
            tot++;

            Tp += Td + f;
            Td = vp*Tp/(vd-vp);
            Tp += Td;
        }

        System.out.println(tot);

    }
}