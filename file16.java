public class file16 {
    public static void main(String[] args) {
        //array- colection of elemnts of the same data type stored in the continious memory location
        //easier to manage large amount of data efficiently
        //arrays are fixed size
        //initialization
        int[] num = {1,2,3,4,5};
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
        for(int j : num){
            System.out.println(j);
        }
        int[][] twodimension = {{1,2,3,4},{5,6,7,8}};
        //jagged array
        //2d array where each row can have a different number of columns
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1,2};
        jagged[1] = new int[]{1,8,9};
        jagged[2] = new int[]{1,8,9,6};

    }
}
/*
 * for-each loop
 * which is used exclusively to loop through in an array
 * syntax
 * for(type variablename:arrayname){
 * //code block to be executed 
 * }
 */
