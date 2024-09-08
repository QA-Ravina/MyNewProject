import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome to armstrong calculation\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if (isArmstrong) {
            System.out.println("Yes, its an armstrong number");
        } else {
            System.out.println("No, its not an armstrong number");
        }
    }

    public static boolean isArmstrong (int num) {
        double sum = Sum(num);
        if( sum == num ) {
            return true;
        } else {
            return false;
        }

    }

    public static int Sum (int num) {
        int count = numberOfDigits(num);
        System.out.println("Number of digits:  " + count);
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            double pow = Math.pow(digit , count);
            sum += pow;
            num /= 10;
            System.out.println("Power of  " + digit + " is " + pow);
        }
        System.out.println("sum is : " + sum);
        return sum;
    }

    public static int numberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;

        }
        return count;
    }
}
