public class prac1 {
    public static void main(String[] args) {
        /*if(args.length < 2){
            System.out.println("Enter the number to add: ");
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int sum = n1 +n2;
        System.out.println("The sum is : " + sum);*/
        if(args.length < 1){
            System.out.println("Enter number to check: ");
        }
        int n = Integer.parseInt(args[0]);
        if(n%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
