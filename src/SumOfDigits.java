import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of digits calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: \n");
        int num = input.nextInt();
        int sum =sumOfDigits(num);
        System.out.println("The sum of Digits would be: " + sum);

    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
