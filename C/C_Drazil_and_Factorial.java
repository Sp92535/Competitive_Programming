import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C_Drazil_and_Factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = { "", "", "2", "3", "322", "5", "53", "7", "7222", "7332" };

        br.readLine();
        char[] ch = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char c : ch){
            sb.append(str[c-'0']);
        }

        int[] arr = Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }
}