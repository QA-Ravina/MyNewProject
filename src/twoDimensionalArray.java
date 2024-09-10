public class twoDimensionalArray {
    public static void main(String[] args) {


        // 2-dimensional array can be defined like this
        int [][] myArr = new int[2][3];
        myArr [0][0]= 9;
        myArr [1][1]= 5;
        myArr [0][1]= 8;
        myArr [1][2]= 10;
        //myArr [1][0]= 12;

        System.out.println(myArr.length);
        System.out.println(myArr[1].length);
        System.out.println(myArr[0][2]);


        // traversal of 2 dimensional array
        System.out.println("Starting traversal of two dimensional");
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j< arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
