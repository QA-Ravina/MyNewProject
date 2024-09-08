import java.util.Scanner;

public class PatternLoops {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of pattern\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the rows upto which you want to print the pattern: ");
        int maxRows = input.nextInt();
        printRightHalfPyramid(maxRows);
        printReverseRightHalfPyramid(maxRows);
    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("Printing Right Half Pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");

            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }
    }

    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("Printing Reverse Right Half Pyramid");
        int rows = 0;
        int i = 1;
        int x = 0;

        while (i <= maxRows) {
            while (rows < maxRows) {
                System.out.print("* ");
                rows++;
            }
            System.out.println();

           i++;
           rows = x+1;
           x++;

        }

    }
}

