public class file17 {
    public static void main(String[] args) {
        String str = "radars";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
        int num = 12345;
        int reversenum = 0;
        int remainder;
        int originalnum = num;
        while(num != 0){
            remainder = num % 10;
            reversenum = reversenum * 10 + remainder;
            num /= 10;
        }
        if(originalnum == reversenum){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
}
