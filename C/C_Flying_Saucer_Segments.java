import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class C_Flying_Saucer_Segments {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp = new HashMap<>();
        dp.put(0L, 1L);
        dp.put(1L, 3L);

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long ans = getPow(n, m) - 1;

        System.out.println(ans < 0 ? ans + m : ans);
    }

    private static Map<Long, Long> dp;

    private static long getPow(long po, long m) {
        if (dp.containsKey(po)) {
            return dp.get(po) % m;
        }
        long an = getPow(po / 2, m) * getPow((po + 1) / 2, m);
        an %= m;
        dp.put(po, an);
        return an;
    }
}