import java.util.*;
public class Mocktest1 {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n% 10) + sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println("The sum of the digits is: "+ result);
    }
}
