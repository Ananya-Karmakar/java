import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class file5 {
    public static void main(String[] args) throws IOException{
        InputStreamReader name = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(name);
        System.out.println("Enter your name: ");
        int myname = Integer.parseInt(br.readLine());
        System.out.println("Hello, "+ myname + "");
    }
}
