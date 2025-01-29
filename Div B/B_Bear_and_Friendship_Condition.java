import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Bear_and_Friendship_Condition {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        @SuppressWarnings("unchecked")
        List<Integer>[] adjList = new List[n+1];
        for(int i=0; i<=n; i++) adjList[i] = new ArrayList<>();

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int src = Integer.parseInt(st.nextToken());
            int dst = Integer.parseInt(st.nextToken());

            adjList[src].add(dst);
            adjList[dst].add(src);
        }   

        boolean[] vis = new boolean[n+1];

        for(int i=1; i<=n; i++){
            if(!vis[i]){

                long[] arr = dfs(i, vis, adjList);

                if(arr[0] != arr[1]*(arr[1]-1)){
                    System.out.println("NO");
                    return;
                }

            }
        }

        System.out.println("YES");
    }
    private static long[] dfs(int src, boolean[] vis, List<Integer>[] adjList){

        vis[src] = true;

        long edg = adjList[src].size(), vert = 1;

        for(int next : adjList[src]){
            if(!vis[next]){

                long[] curr = dfs(next, vis, adjList);
                edg += curr[0];
                vert += curr[1];
            }
        }

        return new long[]{edg,vert};
    }
}