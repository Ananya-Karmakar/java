class Privateex{
    static private int secretcode  = 222;
    static void showcode() {
        System.out.println(secretcode);
     }
}
public class irst {
    public static void main(String[] args) {
        Privateex obj = new Privateex();
        obj.showcode();
    }
}
