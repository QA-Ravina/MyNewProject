import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of Palindrome\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Yes, the number is Palindrome");
        } else {
            System.out.println("No, the number is not a palindrome");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == newNumber(num);   }

        public static int newNumber(int num){
            int digit;
            int newNumber = 0;
            while (num > 0) {
                digit = num % 10;
                newNumber = (newNumber * 10) + digit;
                num /= 10;

            }
            System.out.println("The new number is: " + newNumber);
            return newNumber;

        }
    }

