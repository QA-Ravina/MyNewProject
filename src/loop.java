import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of loop");
        int i = 1;
        while (i<=20) {
            System.out.println(i);
            i++;
        }

        System.out.println("Printing backward from 500 till 200");
        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count--;
     }

        Scanner input = new Scanner(System.in);
        int x = 1;

        while (x <= 5) {
            int y = input.nextInt();
            System.out.println("Your number is : " + y);
            x++;
        }
    }
}
