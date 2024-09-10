import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {

        System.out.println("Printing array through print statement\n");

        int [] myArr = {10, 4, 98, 8 , 11};

        System.out.println(myArr[4]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);


        System.out.println("Printing array through loop\n");

        // printing through loop
        //Also called array traversal
        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

        //Searching of array

        System.out.println("Searching of a number in an array: \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int[] arr = {6, 8, 44,34, 23, 36, 99, 100,1000, 3000, 40, 92, 45, 656};
        boolean searchingInArray = searchingInArray(num, arr);
        if (searchingInArray) {
            System.out.println("Yes your number is present in the array");
        } else {
            System.out.println("No, your number is not present in the array");
        }

    }

    public static boolean searchingInArray(int num, int[] arr ){
        int i = 0;
        while (i < arr.length){
            if (num == arr[i]){
                return true;
            } i++;
        }
        return false;
    }
}
