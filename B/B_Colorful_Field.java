import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_Colorful_Field {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        st.nextToken();
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        long[] waste = new long[k];

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            waste[i] = (a-1L)*m + b;
        }

        Arrays.sort(waste);

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long pos = (a-1L)*m + b;

            long w = getWaste(waste, pos);
            if(w==-1){
                System.out.println("Waste");
                continue;
            }
            long rem = (pos-w)%3;
            System.out.println(getStatus(rem));
        }
        

    }
    private static String getStatus(long x){
        return x==0 ? "Grapes" : x==1 ? "Carrots" : "Kiwis"; 
    }
    private static long getWaste(long[] waste, long pos){
        int l = 0, r = waste.length - 1;

        while(l <= r){
            int mid = (l+r)/2;
            if(pos > waste[mid]){
                l = mid+1;
            }else if(pos < waste[mid]){
                r = mid-1;
            }else{
                return -1;
            }
        }
        return l;
    }
}