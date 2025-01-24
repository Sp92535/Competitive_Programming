import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Suffix_Structures {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int[] A = new int[26];
        int[] B = new int[26];

        for(char ch : a.toCharArray()){
            A[ch-'a']++;
        }
        for(char ch : b.toCharArray()){
            B[ch-'a']++;
        }

        boolean both = false;

        for(int i=0; i<26; i++){
            if(B[i]>A[i]){
                System.out.println("need tree");
                return;
            }
            if(B[i] < A[i]){
                both = true;
            }
        }

        if(both){
            System.out.println(isSubSequence(a,b) ? "automaton" : "both");
        }else{
            System.out.println("array");
        }
        
    }
    private static boolean isSubSequence(String a, String b){
        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();

        int i = 0, j = 0;

        while(i < a.length() && j < b.length()){
            if(chA[i]==chB[j]) j++;
            i++;
        }

        return j==b.length();
    }

}