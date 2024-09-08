import java.util.Scanner;

public class AddingOddNos_till_N {
    public static void main(String[] args) {
        greeting();
        int N = number();
        int sum = addingOddNos(N);
        System.out.println("OddSum till " + N + " is: " + sum);
    }

    public static void greeting() {
        System.out.println("Welcome to the calculator of adding odd nos\n");
    }

    public static int number() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number upto which you want to add the odd nos. : ");
        return input.nextInt();
    }

    public static int addingOddNos(int N) {
        int sum = 0;
        int i = 1;
        while (N >= i) {
            sum +=i; // sum = sum + i
            i += 2; // i = i +2
        }
        return sum;
    }
}
