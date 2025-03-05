public class file15 {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("priya");
        name.append(" welcome");//editing existing memeory
        System.out.println(name);
        StringBuffer name1 = new StringBuffer("hello welcome");
        name1.append(" ananya");
        System.out.println(name1);
    //string buffer is slower than string builder
        name1.insert(0, 'f');
        System.out.println(name1);
        name.replace(1,3,"ad");
        System.out.println(name);
        name1.delete(1, 3);
        System.out.println(name1);
        name1.reverse();
        System.out.println(name1);
        System.out.println(name.charAt(0));
        name.setCharAt(3, 'j');
        System.out.println(name);
    }
}
//faster and efficient memory storage
