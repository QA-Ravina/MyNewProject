import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {

        greet();  //calling greet method to print welcome message
        int x = number();   //calling number method to get a number and storing it into x
        printMultiplicationTable(x);    //passing the number x to print the table
        }

        public static void greet(){
            System.out.println("Welcome to multiplication world\n");
        }

        public static int number() {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your number: ");
            return input.nextInt();

        }
        public static void printMultiplicationTable (int num) {
            int i;
            for (i = 1; i <= 10; i++) {
                int y = num * i;
                System.out.println(num + " * " + i + " = " + (num * i));
            }

        }
    }

