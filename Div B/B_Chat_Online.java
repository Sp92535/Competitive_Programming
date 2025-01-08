import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Chat_Online {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] Z = new int[p][2];
        int[][] X = new int[q][2];


        for(int i=0; i<p; i++){
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            Z[i][0] = a;
            Z[i][1] = b;
        }
        for(int i=0; i<q; i++){
            st = new StringTokenizer(br.readLine());
            
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            X[i][0] = c;
            X[i][1] = d;
        }

        int t = l;
        int not = 0;
        
        while(t<=r){
            int i = 0, j = 0;
            boolean flag = false;
            while(i<q && j<p){

                if(
                    (X[i][0]+t <= Z[j][1] && X[i][1]+t >= Z[j][0])
                ){
                    t += Z[j][1] - (X[i][0]+t) + 1;
                    flag = true;
                    break;
                }

                if(X[i][0]+t > Z[j][1]) j++;
                else i++;
            }

            if(!flag){
                not++;
                t++;
            }
        }

        System.out.println(r-l+1-not);
    }
}
// O((l-r)*(p+q))