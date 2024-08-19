import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Welcome to swapping station");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int A = input.nextInt();
        System.out.println("Enter value of B: ");
        int B = input.nextInt();
        int C = A;
        A = B;
        B = C;
        System.out.println("Swapping is done....");
        System.out.println("Value of A is: " + A);
        System.out.println("Value of B is: " + B);

    }
}
