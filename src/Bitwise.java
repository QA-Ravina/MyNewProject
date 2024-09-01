import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        // Create a program that shows bitwise AND of two numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND operator");

        System.out.print("\nPlease enter the First number: ");
        int First = input.nextInt();

        System.out.print("Please enter the second number: ");
        int Second = input.nextInt();

        int result = First & Second; //First converts into binary and then compares each bit, if any of the bit will have 0 then the output bit will be 0

        System.out.println("\nResult is: " + result);

        //Create a program that shows Bitwise OR of 2 numbers
        System.out.println("\n##Showcasing Bitwise OR operator");

        System.out.print("Please enter the first number: ");
        int Num1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int Num2 = input.nextInt();

        int Final_result = Num1 | Num2; // First converts into binary and compares each bit of the binary, if any of the bit would be 1, then the output bit will be 1

        System.out.println("Result is : " + Final_result);

        //Create a program that shows Bitwise XOR of 2 numbers
        System.out.println("\n##Showcasing Bitwise XOR operator");

        System.out.print("Please enter the first number: ");
        int N1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int N2 = input.nextInt();

        int FinalResult = N1 ^ N2; // First converts into binary and after comparing, if both the bits are same then the output bit would be 0 and if both the bits are different then the output bit would be 1

        System.out.println("Result is : " + FinalResult);

        //Create a program to show bitwise compliment of a number

        System.out.println("\n##Welcome to showcase on not / compliment operator ");

        System.out.print("Please enter the number: ");
        int Number = input.nextInt();

        int Res = ~Number; //Firstly it will make total 8 digits by keeping 0 in the start remaining portions to make it 8 bit and then change each of the bit to opposite bit,
        System.out.println("Result is : " + Res);

        // Create a program that shows use of left shift operator

        System.out.println("\n##Welcome to showcase left shift operator ");

        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        int Ans = num << 1; // This will remove the left bit and then write 0 in the right most space
        System.out.println("Result is : " + Ans);

        // Create a program that shows use of right shift operator

        System.out.println("\n##Welcome to showcase right shift operator ");

        System.out.print("Please enter the number: ");
        int numb = input.nextInt();

        int Answer = numb >> 1; // This will remove the left bit and then write 0 in the right most space
        System.out.println("Result is : " + Answer);
    }
}
