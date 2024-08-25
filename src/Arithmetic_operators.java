import java.sql.SQLOutput;
import java.util.Scanner;

public class Arithmetic_operators {
   public static void main(String[] args) {
        int A = 8;
        int B = 5;

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);

        double X = 5;
        double Y = 3;

        System.out.println(X+Y);
        System.out.println(X-Y);
        System.out.println(X*Y);
        System.out.println(X/Y);

//        //Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%)
//
        Scanner input = new Scanner(System.in);
        System.out.println("\n ##Welcome to Arithmetic Calculation");

        System.out.print("\nGive me number 1: ");
        int p = input.nextInt();
        System.out.print("Give me number 2: ");
        int q = input.nextInt();


        System.out.println("Addition = " + (p+q));
        System.out.println("Subtraction = " + (p-q));
        System.out.println("Multiplication = " + (p*q));
        System.out.println("Divison = " + (p/q));
        System.out.println("Modulus= " + (p%q));


//        //Create a program to calculate product of 2 floating point numbers
//
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ##We are doing float multiplication\n");
        System.out.print("Please give first decimal number: ");
        double P = sc.nextDouble();
        System.out.print("Please give second decimal number: ");
        double Q = sc.nextDouble();
        System.out.println("Product =  "+ (P*Q));

//
//        // Create a program to calculate the perimeter of a 4 sided figure
//
        Scanner perimeter = new Scanner(System.in);
        System.out.println("\n ##Calculating Perimeter of a 4 sided figure");
        System.out.println("\nPlease provide the 4 sides in cms");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        double side4 = input.nextDouble();

        System.out.println("Perimeter = " + (side1+side2+side3+side4) + "cm");

        // Calculating area of triangle

        Scanner area = new Scanner(System.in);
        System.out.println("## Calculating area of triangle");

        System.out.print("\nPlease Enter Base of the triangle in cms: ");
        double base = area.nextDouble();
        System.out.print("Please Enter height of the triangle in cms: ");
        double height = area.nextDouble();

        System.out.println("The area of triangle is " + ((base*height)/2) + " cm sq");

        // Create a program to calculate simple interest

       Scanner Interest = new Scanner(System.in);
       System.out.println("\n ## Welcome to simple interest calculator");

       System.out.print("Please enter your Principal amount Rs: ");
       int Principal = Interest.nextInt();

       System.out.print("Please enter the rate of interest in percentage: ");
       float Rate = Interest.nextFloat();

       System.out.print("Please enter the time in years: ");
       float Time = Interest.nextFloat();

       System.out.println("\nThe simple interest would be Rs " + ( ( (Principal * Rate * Time) /100) ) );

       // Calculating the compound interest

       Scanner CI = new Scanner(System.in);
       System.out.println("\n Welcome to Compound Interest Calculator");

       System.out.print("Please enter your Principal amount Rs: ");
       int Pr = CI.nextInt();

       System.out.print("Please enter the rate of interest in percentage: ");
       float R = CI.nextFloat();

       System.out.print("Please enter the time in years: ");
       float T = CI.nextFloat();

       double CompInt = Pr * Math.pow(1 + R/100, T);
       System.out.println("Your Compound Interest is Rs: " + CompInt);

       //Create a program to convert Fahrenheit to celcius

       Scanner degree = new Scanner(System.in);
       System.out.print("\n Welcome to Temperature Converter");
       System.out.println("Enter your temp in F: ");
       float Fah = degree.nextFloat();

       float Cel = (Fah - 32)* 5.0f / 9.0f ;

       System.out.println("\nThe temperature in Celcius would be: " + Cel + "C");

            }
    }