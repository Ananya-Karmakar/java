import java.util.*;
public class file9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements: ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are: ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("The elements are: ");
        for(int i=10;i>0;i--){
            System.out.print(i+" ");
        }

    }
}
