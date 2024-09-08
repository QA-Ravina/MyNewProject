import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of LCM\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Please enter number 2: ");
        int num2 = input.nextInt();
        int LCM = LCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " would be " + LCM );
    }

    public static int LCM(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }
}
