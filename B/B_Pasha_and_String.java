import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Pasha_and_String {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        int n = ch.length;
        int[] score = new int[n + 1];

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){

            int curr = Integer.parseInt(st.nextToken()) - 1;

            score[curr]++;
            score[n-curr]--;
        }

        int currScore = 0;
        for(int i=0; i<n; i++){
            currScore += score[i];

            char temp = ch[i];
            if(currScore%2!=0){
                temp = ch[n-i-1];
                ch[n-i-1] = ch[i];
            }
            
            System.out.print(temp);
        }

    }
}