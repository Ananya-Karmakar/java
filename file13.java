import java.util.*;
public class file13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        String str = "  Hello World      ";
        String trimmedStr = str.trim();
        System.out.println(trimmedStr + "");

    }
}
