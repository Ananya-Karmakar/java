public class file26 {
    public static String reversestring(String str){
        if(str.isEmpty()){
            return str;
        }
        return reversestring(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String name = "ananya";
        String s1 = reversestring(name);
        System.out.println(s1);
    }
    
}
