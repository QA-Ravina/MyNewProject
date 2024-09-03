import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int num1 = readNumber();
        int num2 = readNumber();
        int sum = num1 + num2;

        System.out.println("The sum of the number is: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int i = input.nextInt();
        return i;
    }

    public static void greet() {
        System.out.println("Good morning\n");
    }


}
