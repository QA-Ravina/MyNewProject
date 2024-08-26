
import java.util.Scanner;

public class If_Else_Challenges {
    public static void main(String[] args) {

        // Create a program to determine if a number is positive negative or zero

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number Checker");

        System.out.print("\nPlease Enter your Number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your number is positive");
        } else if (num == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Your number is negative");
        }

        //Create a program to determine if a number is odd or even

        Scanner oddeven = new Scanner(System.in);
        System.out.println("\nWelcome to odd even calculator");
        System.out.print("\nPlease Enter your Number: ");
        int N = oddeven.nextInt();

        if (N % 2 == 0) {
            System.out.println("Your Number is Even");
        } else {
            System.out.println("Your number is Odd");
        }

        // Create a program that determines greatest of the three numbers

        Scanner Largest = new Scanner(System.in);
        System.out.println("\nWelcome to the calculator which finds largest number");

        System.out.print("Please provide number 1: ");
        int number1 = Largest.nextInt();

        System.out.print("Please provide number 2: ");
        int number2 = Largest.nextInt();

        System.out.print("Please provide number 3: ");
        int number3 = Largest.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The largest number is: " + number1);
        } else if (number2 >= number3) {
            System.out.println("The largest number is: " + number2);
        } else {
            System.out.println("The largest number is: " + number3);
        }

        //Check whether the given year is a leap year or not

        Scanner leap = new Scanner(System.in);
        System.out.println("\n Welcome to leap year calculator");
        System.out.print("Please Enter the year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap year");
        }

        // create a program that calculates grades based on marks, A- above 90, B- above 75, C- above 60, D- above 30, F- below 30

        Scanner grades = new Scanner(System.in);
        System.out.println("\n ##Welcome to Grades calculator");

        System.out.print("\n Please Enter your scored marks : ");
        int grade = grades.nextInt();

        if (grade >=90) {
            System.out.println("Wow ! Your grade is A");
        } else if (grade >= 75) {
            System.out.println("Your grade is B, keep it up");
        } else if (grade >= 60) {
            System.out.println("Your grade is C");
        } else if (grade >= 30) {
            System.out.println("Your grade is D, You have to practice more !!");
        } else {
            System.out.println("oh shit !! you failed, Your score is F");
        }

        // Write a program that categorize a paerson into different age group
        Scanner age_group = new Scanner(System.in);
        System.out.println("\n Welcome to age group calculator");
        System.out.print("Please enter your age: ");
        int age = age_group.nextInt();

        if (age < 13 ) {
            System.out.println("You are a child");
        } else if (age < 20 ){
            System.out.println("You are teen");
        } else if (age < 60) {
            System.out.println("You are an adult");
        }  else {
            System.out.println("You are senior");
        }



    }
    }

