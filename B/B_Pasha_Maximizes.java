import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Pasha_Maximizes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> ll = new LinkedList<>();
        for (int num : Arrays.stream(st.nextToken().split("")).mapToInt(Integer::parseInt).toArray()) {
            ll.add(num);
        }

        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < ll.size() && k > 0; i++) {
            int idx = i;
            for (int j = i + 1; j < Math.min(i + 1 + k, ll.size()); j++) {

                if (ll.get(j) > ll.get(idx)) {
                    idx = j;
                }

            }

            if (idx != i){

                k -= idx - i;
                int num = ll.get(idx);
    
                ll.remove(idx);
                ll.add(i,num);
            }

        }

        for (int i : ll)
            System.out.print(i);

    }

}