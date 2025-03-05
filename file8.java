public class file8 {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Enter your name and age: ");
            return;
        }
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            System.out.println("Hello "+ name + " age: "+ age);
        }
    }
/*when to use command line arguments?
Ans: security purposes: while entering password it needs to verify*/
//for loop: when you know exactly how many times you want to loop through a block of code
//while loop : when we dont know the reaching condition
/*For(Initialization;Condition;Update){
 * code block
} */
