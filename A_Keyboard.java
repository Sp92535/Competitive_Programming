import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Keyboard {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int dir = br.readLine().equals("L") ? 1 : 0;

        char[][] neigh = {{'0','s'},{'v','n'},{'x','v'},{'s','f'},{'w','r'},{'d','g'},{'f','h'}
        ,{'g','j'},{'u','o'},{'h','k'},{'j','l'},{'k',';'},{'n',','},{'b','m'},{'i','p'},{'o','0'}
        ,{'0','w'},{'e','t'},{'a','d'},{'r','y'},{'y','i'},{'c','b'},{'q','e'},{'z','c'},{'t','u'},{'0','x'}};

        char[] ch = br.readLine().toCharArray();

        for(int i=0; i<ch.length; i++){
            ch[i] = switch(ch[i]){
                case ';' -> 'l';
                case '/' -> '.';
                case '.' -> dir==0 ? ',' : '/';
                case ',' -> dir==0 ? 'm' : '.';
                default -> neigh[ch[i]-'a'][dir];
            };
        }
        System.out.println(new String(ch));
    }
}