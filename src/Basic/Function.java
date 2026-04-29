package Basic;

public class Function {

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(3);
    }
}


//    Important Rules
//✔   void → no return
//✔   int / String / boolean → must return value
//✔    return ends the function
//✔   Function runs only when called

