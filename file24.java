
public class file24 {
    static int fibo(int n){
        if(n<=1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n= 20;
        for(int i=0;i<20;i++){
            if(fibo(i) >=1 && fibo(i) <=20){
                System.out.println(fibo(i)+" ");
            }
        }
    }
}
