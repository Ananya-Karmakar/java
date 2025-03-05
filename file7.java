import java.io.Console;

public class file7 {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null){
            System.out.println("No console"); 
            return;
        }
        String username = console.readLine("Enter name: ");
        char[] passwordchars = console.readPassword("Enter password: ");
        String password = new String(passwordchars);
        System.out.println("Username: " + username);
        System.out.println("Password entered: " + password);
     }
}
