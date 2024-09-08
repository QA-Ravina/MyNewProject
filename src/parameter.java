public class parameter {
    public static void main(String[] args) {
        System.out.println(SumTwoNumbers(10,10));
        // method call krne time jab values bhejte hai toh usse arguement kehte hai
        System.out.println(SumTwoNumbers(30,20));
        System.out.println(SumTwoNumbers(33,-33));

    }

    public static int SumTwoNumbers(int firstNum , int secondNum) {
    //function ke sath wale bracket mein jo likhte hai usse parameter kehte hai
        System.out.println("Print first number : " + firstNum);
        System.out.println("Print second number : " + secondNum);

        return firstNum + secondNum;
    }
}
