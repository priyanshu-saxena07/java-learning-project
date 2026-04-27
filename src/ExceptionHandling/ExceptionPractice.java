package ExceptionHandling;

public class ExceptionPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int result = a / b;

        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        int a2 = 10;
        int b2 = 0;
        int[] arr = {1, 2, 3};
        try {
            System.out.println(a / b);
            System.out.println(args[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        } catch (ArithmeticException e) {
            System.out.println("for divide by zero");
        }







    }
}
