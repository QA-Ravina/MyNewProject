import java.util.Scanner;

public class Logical_operators {
    public static void main(String[] args) {

        //Question: WAP to show discount, if age is less than 5 then discount is 75%, if age is more than 60, then discount is 25%, and if the gender is female then the discount is 50%. Whenever the 2 case conflicts then the higher discount will be applicable.

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");

        System.out.print("\nPlease Enter your age: ");
        int age = input.nextInt();

        System.out.print("\nAre you a female? (say true or false): ");
        boolean isfemale = input.nextBoolean();

        if (isfemale) {
            if (age < 5) {
                System.out.println("Your discount is 75%");
            } else {
                System.out.println("Your discount is 50%");
            }
        } else {
            if (age<5 ) {
                System.out.println("Your discount is 75%");
            } else if (age > 60) {
                System.out.println("Your discount is 25%");
            } else {
                System.out.println("You have no discount");
            }

            }
        }
    }


