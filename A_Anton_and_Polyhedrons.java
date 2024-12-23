import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long count = 0;
        for(int i=0; i<n; i++){
            count += switch (br.readLine()) {
                case "Tetrahedron" -> 4;
                case "Cube" -> 6;
                case "Octahedron" -> 8;
                case "Dodecahedron" -> 12;
                case "Icosahedron" -> 20;
                default -> 0;
            };
        }
        System.out.println(count);
    }
}