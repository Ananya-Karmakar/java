import java.util.*;
public class ile18 {
    public static void main(String[] args) {
        int num1[] = {1,2,3,4};
        int num2[] = {1,2,3,5};
        
        boolean a = Arrays.equals(num1,num2);
        if(a){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
