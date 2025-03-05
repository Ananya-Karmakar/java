import java.util.Arrays;

public class file19 {
    public static void main(String[] args) {
        int num[] = {1,2,9,4};
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println(sum);
        Arrays.sort(num);
        System.out.println(num[num.length-1]);
    }
}
