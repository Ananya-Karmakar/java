class example{
    static private int a = 10;
    protected int b = 12;
    public int c = 14;
    private void show1(){
        System.out.println(a);
    }
    void show2(){
        System.out.println(b);
    }
    void show3(){
        System.out.println(c);
    }
    
}
public class second{
    public static void main(String[] args) {
        example obj = new example();
       //obj.show1();
        //obj.show2();
        //obj.show3();
        
    }
}
