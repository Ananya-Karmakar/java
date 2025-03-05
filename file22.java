import java.util.*;
public class file22 {
    static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int val = fact(10);
        System.out.println(val);
    }
}
