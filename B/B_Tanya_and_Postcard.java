import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Tanya_and_Postcard {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(), t = br.readLine();

        int[][] req = new int[26][2];
        int[][] avai = new int[26][2];

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                req[ch - 'a'][0]++;
            } else {
                req[ch - 'A'][1]++;
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                avai[ch - 'a'][0]++;
            } else {
                avai[ch - 'A'][1]++;
            }
        }

        int yay = 0;
        int whoops = 0;

        for (int i = 0; i < 26; i++) {

            int temp1 = Math.min(req[i][0], avai[i][0]);
            avai[i][0] -= temp1;
            req[i][0] -= temp1;
            yay += temp1;

            int temp2 = Math.min(req[i][1], avai[i][1]);
            avai[i][1] -= temp2;
            req[i][1] -= temp2;
            yay += temp2;

            int temp3 = Math.min(req[i][0], avai[i][1]);
            avai[i][1] -= temp3;
            req[i][0] -= temp3;
            whoops += temp3;

            int temp4 = Math.min(req[i][1], avai[i][0]);
            avai[i][0] -= temp4;
            req[i][1] -= temp4;
            whoops += temp4;
        }

        System.out.println(yay + " " + whoops);
    }
}