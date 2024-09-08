import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of reversing the number\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("After reversing the number would be: " + reverse);
    }

    public static int reverse(int num){
        int newNum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            newNum = (newNum * 10) + digit;
           num /= 10; // num = num / 10;
        }
        return newNum;
    }
}
