public class UnaryOperator {
    public static void main(String[] args) {

        // can convert positive to negative by writing "-"
        int x = 5;
        int y = -x;
        System.out.println(y);
        int z = -y;
        System.out.println(z);

        //to increase 1
        int a = 10;
      //  a = a+1;  normal method
      //  a++; post increment, pehle apply kro then increase it
        System.out.println(a++); // Is line tak sirf apply hua hai
        System.out.println(a);

        int b = 50;
       // ++b; pre increment, pehle increase kro then apply it
        System.out.println(++b); //Is line mein pehle increase hua then apply hua
        System.out.println(b);

        //to decrease 1

        int p = 100;
        //  p = p-1;  normal method
        //  p--; post increment, pehle apply kro then increase it
        System.out.println(p--); // Is line tak sirf apply hua hai
        System.out.println(p);

        int q = 150;
        // --q; pre increment, pehle increase kro then apply it
        System.out.println(--q); //Is line mein pehle increase hua then apply hua
        System.out.println(q);

    }
}
