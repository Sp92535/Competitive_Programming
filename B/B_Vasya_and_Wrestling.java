import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_Vasya_and_Wrestling {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long first = 0;
        long second = 0;

        ArrayList<Integer> f = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();

        boolean flag = false;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            int a = Integer.parseInt(br.readLine());

            if (i == n - 1)
                flag = a > 0;

            if (a > 0) {
                first += a;
                f.add(a);
            } else {
                second += -a;
                s.add(-a);
            }
        }

        if (first > second) {
            System.out.println("first");
            return;
        } else if (first < second) {
            System.out.println("second");
            return;
        }
        
        int great = getGreat(f, s);
        if (great==0) {
            System.out.println(flag ? "first" : "second");
        } else {
            System.out.println(great > 0 ? "first" : "second");
        }

    }
    private static int getGreat(ArrayList<Integer> first, ArrayList<Integer> second){
        for(int i=0, j=0; i<first.size() && j<second.size(); i++, j++){
            if(first.get(i) > second.get(j)){
                return 1;
            }else if(first.get(i) < second.get(j)){
                return -1;
            }
        }
        return second.size() > first.size() ? -1 : second.size() < first.size() ? 1 : 0; 
    }

}