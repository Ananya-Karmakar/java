import java.util.*;
public class file14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 1234;
        int i=1;
        while(i<4){
            System.out.println("Enter the pin: ");
                int pin = sc.nextInt();
            if(password == pin){
                System.out.println("Pin matched");
                break;
            }else{
                System.out.println("Not matched");
                i++;
                
            }
        }
    }
}
/*
differences--->
 * String - Immutable, Slow, when string is not changed
 * StringBuilder - Mutable, fast, modified
 * String Buffer - Mutable, slower than builder, modified
 */
