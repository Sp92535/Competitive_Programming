import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Complete_the_Word {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] idx = new Integer[26];
        


        int unique = 0;
        int replace = 0;

        char[] ch = br.readLine().toCharArray();

        int x = 0, y = 0;

        while(unique + replace < 26 && y < ch.length){
            
            if(ch[y]=='?'){
                replace++;
            }else if(idx[ch[y] - 'A']!=null){

                int target = idx[ch[y] - 'A'] + 1;
                while(x <  target){
                    if(ch[x]=='?'){
                        replace--;
                    }else if(idx[ ch[x] - 'A' ] != null){
                        idx[ ch[x] - 'A' ] = null;
                        unique--;
                    }
                    x++;
                }
            }

            if(ch[y]!='?'){
                idx[ch[y] - 'A'] = y;
                unique++;
            }

            y++;
        }


        if(unique + replace < 26){
            System.out.println(-1);
            return;
        }

        fill(ch,x,y);
        
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='?'){
                ch[i] = 'A';
            }
        }

        System.out.println(new String(ch));

    }

    private static void fill(char[] ch, int x, int y){
        boolean[] arr = new boolean[26];

        for(int i=x; i<y; i++){
            
            if(ch[i]=='?') continue;
            arr[ch[i]-'A'] = true;
        }

        int k = 0;
        
        for(int i=x; i<y; i++){
            
            if(ch[i]!='?') continue;

            while(arr[k]) k++;
            
            ch[i] = (char)(k + 'A');
            k++;
        }
    }

}