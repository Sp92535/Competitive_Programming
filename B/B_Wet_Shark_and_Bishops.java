import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B_Wet_Shark_and_Bishops {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> down = new HashMap<>();
        Map<Integer, Integer> up = new HashMap<>();


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            down.put(y - x, down.getOrDefault(y - x, 0) + 1);
            up.put(y + x, up.getOrDefault(y + x, 0) + 1);
        }
        long pairs = 0;
        for (int bishops : down.values()) {
            pairs += getSum(bishops - 1);
        }
        for (int bishops : up.values()) {
            pairs += getSum(bishops - 1);
        }

        System.out.println(pairs);
    }

    private static long getSum(int n) {
        return (n + 1) * n / 2L;
    }
}