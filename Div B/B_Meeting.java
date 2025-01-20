import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Meeting {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        int[][] rad = new int[n][3];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            rad[i][0] = Integer.parseInt(st.nextToken());
            rad[i][1] = Integer.parseInt(st.nextToken());
            rad[i][2] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i=Math.min(x1, x2); i<=Math.max(x1, x2); i++){
            
            boolean flag = true;
            for(int j=0; j<n; j++){
                double disA = getDis(i, y1, rad[j][0], rad[j][1]);
                
                if((double)rad[j][2] >= disA){
                    flag = false;
                    break;
                }
                
            }
            if(flag){
                count++;
            }

            flag = true;
            for(int j=0; j<n; j++){
                double disB = getDis(i, y2, rad[j][0], rad[j][1]);
                
                if((double)rad[j][2] >= disB){
                    flag = false;
                    break;
                }
                
            }
            if(flag){
                count++;
            }
        }

        for(int i=Math.min(y1, y2)+1; i<Math.max(y1, y2); i++){

            boolean flag = true;
            for(int j=0; j<n; j++){
                double disA = getDis(x1, i, rad[j][0], rad[j][1]);
                
                if((double)rad[j][2] >= disA){
                    flag = false;
                    break;
                }

            }
            if(flag){
                count++;
            }

            flag = true;
            for(int j=0; j<n; j++){
                double disB = getDis(x2, i, rad[j][0], rad[j][1]);
                
                if((double)rad[j][2] >= disB){
                    flag = false;
                    break;
                }

            }
            if(flag){
                count++;
            }
        }

        System.out.println(count);
    }

    private static double getDis(int x, int y, int a, int b){
        return Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));
    }

}