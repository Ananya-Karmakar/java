class Privateex{
    private int secretcode  = 222;
    void showcode() {
        System.out.println(secretcode);
     }
}
public class First {
    public static void main(String[] args) {
        Privateex obj = new Privateex();
        obj.showcode();
    }
}
