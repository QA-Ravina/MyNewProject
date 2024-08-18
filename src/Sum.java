import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Please Enter the first number: ");
        int FirstNum = input.nextInt();
        System.out.print("Please Enter the second number: ");
        int SecondNum = input.nextInt();
        int Sum = FirstNum + SecondNum;
        System.out.println("Sum of your number is: " + Sum);
    }
}
