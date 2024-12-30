import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Alyona_and_Numbers {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] st = br.readLine().split(" ");
        long n = Long.parseLong(st[0]), m = Long.parseLong(st[1]);

        
        long rem_m = m % 5;
        long rem_n = n % 5;

        long useful_extra = rem_n - 4 + rem_m;
        useful_extra = useful_extra > 0 ? useful_extra : 0;

        long group_n = n/5;
        long group_m = m/5;

        
        long ans = group_m*n + group_n*rem_m + useful_extra;

        System.out.println(ans);
    }
}