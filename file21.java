public class file21 {
    public static  int add(int a,int b){
        return a+b;
    }
    public static int findmax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void sendmail(String name,String company){
        String emaildraft = "dear "+ name + " welcome to " + company +" ";
        System.out.println(emaildraft);
    }
    public static void main(String[] args) {
        int sum = add(3,4);
        System.out.println(sum);
        int max = findmax(6, 9);
        System.out.println(max);
        sendmail("ananya", "abc");
    }
}

/*
 * Recursion is a process of function calling itself
 * It breakdown the problem into smaller problem
 * Base case- A condition to stop the recursion
 * Recursion case - The function calls itself with modified arguments to approach the base case
 * Syntax
 * returntype methodname(parameters){
 * if(base case){
 * return result;
 * }
 * return methodname(updated parameters)};
 */