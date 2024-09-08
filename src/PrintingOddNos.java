import java.util.Scanner;

public class PrintingOddNos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number upto which you want to print odd nos: \n");
        int n = input.nextInt();

        while (n >= 1) {
        if (n % 2 == 0){
                System.out.println(n-1);
            } n--;
        }
    }
}
