import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_OR_in_Matrix {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);

        int[][] arr = new int[m][];
        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.fill(ans[i], 1);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0){
                    Arrays.fill(ans[i], 0);
                    for(int k=0; k<m; k++) ans[k][j] = 0;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1){

                    int or = 0;

                    for(int k=0; k<m; k++){
                        or |= ans[k][j];
                    }
                    for(int k=0; k<n; k++){
                        or |= ans[i][k];
                    }
                    
                    if(or==0){
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        
        System.out.println("YES");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}