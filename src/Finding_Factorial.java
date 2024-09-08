import java.util.Scanner;

public class Finding_Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of factorial\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter the number to perform factorial: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("The factorial of " + num + " is " + fact);

    }

    public static long factorial(int num) {

        if (num < 2) {
            return 1;
        }

        int i = 2;
        long fact = 1;
        while (i <= num) {
            fact *=i; //fact = fact * i;
            i++;
        }
         return fact;
        }
    }


