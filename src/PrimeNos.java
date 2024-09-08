import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args) {

        System.out.println("Welcome to the world of prime nos\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Your number is Prime");
        } else {
            System.out.println("Your number is not prime");
        }

    }

    public static boolean isPrime(int num) {
        int i = 2;
        if (num == 1) {
            return false;
        }
            while (i < num) {
                if (num % i == 0) {
                    return false;
                } i++;
            }
        return true;

    }
}

