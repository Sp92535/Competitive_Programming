import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_DZY_Loves_Chemistry {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        @SuppressWarnings("unchecked")
        List<Integer>[] adjList = new List[n+1];

        for(int i=0; i<n+1; i++) adjList[i] = new ArrayList<>();

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());

            adjList[src].add(dst);
            adjList[dst].add(src);
        }
        boolean[] vis = new boolean[n+1];

        long max = 1;
        for(int i=0; i<n+1; i++){
            if(!vis[i])
                max *= (1L<<getLength(i, adjList, vis)-1);
        }
        System.out.println(max);
    }
    private static int getLength(int src, List<Integer>[] adjList, boolean[] vis){
        if(vis[src]) return 0;

        vis[src] = true;

        int len = 1;

        for(int dst : adjList[src]){
            len += getLength(dst, adjList, vis);
        }

        return len;
    }
}