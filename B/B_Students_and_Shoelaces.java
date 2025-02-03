import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_Students_and_Shoelaces {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] rank = new int[n+1];

        @SuppressWarnings("unchecked")
        List<Integer>[] adjList = new List[n+1];


        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            rank[a]++;
            rank[b]++;

            if(adjList[a]==null) adjList[a] = new ArrayList<>();
            if(adjList[b]==null) adjList[b] = new ArrayList<>();

            adjList[b].add(a);
            adjList[a].add(b);
        }

        boolean flag = true;
        int[] temp = rank.clone();
        int tot = 0;
        while(flag){
            flag = false;

            for(int i=1; i<=n; i++){
                if(temp[i]!=1) continue;
                rank[i]--;
                for(int k : adjList[i]){
                    rank[k]--;
                }
                flag = true;
            }
            if(flag) tot++;
            temp = rank.clone();
        }

        System.out.println(tot);
    }
}
// O(n²)