import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Welcome to fibonacci series\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number upto which you eant to see fiboonacci series: ");
        int num = input.nextInt();
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int num) {
        if(num < 0) return;
        System.out.print("The fibonacci series: 0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while ( first + second  <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
