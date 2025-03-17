import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_Semifinals {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean[][] res = new boolean[2][n];

        // [semifinal ,val ,index ]
        Stack<int[]> stk = new Stack<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sf1 = Integer.parseInt(st.nextToken());
            int sf2 = Integer.parseInt(st.nextToken());

            int[] arr1 = { 0, sf1, i };
            int[] arr2 = { 1, sf2, i };

            if (stk.size() == n - 1) {
                if (arr1[1] > arr2[1]) {
                    stk.push(arr2);
                    res[1][i] = true;
                } else {
                    stk.push(arr1);
                    res[0][i] = true;
                }
            } else if (stk.size() < n) {
                stk.push(arr1);
                res[0][i] = true;
                stk.push(arr2);
                res[1][i] = true;
            }else{
                pq.add(arr1);
                pq.add(arr2);
            }

        }

        while (!stk.isEmpty()) {
            pq.add(stk.pop());

            int[] top = pq.poll();
            res[top[0]][top[2]] = true;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[0][i] ? 1 : 0);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(res[1][i] ? 1 : 0);
        }

    }
}