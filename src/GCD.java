import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of GCD\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        int GCD = gcd(num1 , num2);
        System.out.println("\nGCD of the 2 numbers is: " + GCD);

    }

    public static int gcd(int num1, int num2) {
        int i = 1;
        int gcd = 2;
        while (gcd <= least(num1, num2)) {
            if ( num1 % gcd == 0 && num2 % gcd == 0){
               i = gcd;
            }
            gcd++;

        }
        return i;
    }

    public static int least(int num1, int num2){
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }

    }
}
