import java.util.Scanner;

public class Even_odd_using_bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Odd/Even calculator using bitwise");
        System.out.print("Please Enter your number: ");
        int number = input.nextInt();

        if ((number & 1) == 1) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
    }
}
