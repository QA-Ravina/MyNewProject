import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        int a = 5;


        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();

        //a = a + x1;     //Normal way to increase the number
        a += x1;             //Short hand operator
        System.out.println(a);

        int x2 = input.nextInt();
       // a = a + x2;    //Normal way to increase the number
        a += x2;             //Short hand operator
        System.out.println(a);

        int x3 = input.nextInt();
       // a = a + x3;     //Normal way to increase the number
        a += x3;             //Short hand operator
        System.out.println(a);

        int x4 = input.nextInt();
       // a = a + x4;      //Normal way to increase the number
        a += x4;             //Short hand operator
        System.out.println(a);





    }
}
