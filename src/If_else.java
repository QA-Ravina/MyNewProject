import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();


        if (age >= 18  && age <=60) {
            System.out.println("Hello Adult");
        } else if (age>60){
            System.out.println("Hello Senior Citizen");
        } else {
            System.out.println("Hello Child");
        }
    }
}
