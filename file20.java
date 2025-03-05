public class file20 {
    public static void main(String[] args) {
        int num1[][] = {
            {1,2,3,4},
            {5,6,7,8}
        };
        int num2[][] = {
            {5,6,7,8},
            {1,2,3,4}
        };
        int sum[][] = new int[num1.length][num1[0].length];
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[0].length;j++){
                sum[i][j] = num1[i][j] + num2[i][j];
            }
        }
        System.out.println("The value of the sum is: ");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//methods- blocks of code that perform a specific task.help in code reusability,modularization,and better organization of program
/*
 * modifier returntype methodname(parameters){
 * //method body
 * return value (if return type is not void)
 * }
 */
