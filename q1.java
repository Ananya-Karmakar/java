import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the activity: ");
        String act = sc.next();
        System.out.println("Enter the time: ");
        float time = sc.nextFloat();
        switch (act) {
            case "Running":
            float calory = 10 * time;
            System.out.println("Calory burned: " + calory);
                break;
                case "Cycling":
                float calory1 = 8 * time;
                System.out.println("Calory burned: " + calory1);
                break;
                case "Swimming":
                double calory2 = 9.8 * time;
                System.out.println("Calory burned: " + calory2);
                break;
            default:
                break;
        }
    }
}
