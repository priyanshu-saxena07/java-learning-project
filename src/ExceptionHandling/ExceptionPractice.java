package ExceptionHandling;

public class ExceptionPractice {
     public static void main(String[] args) {

         int[] numbers = {10, 20, 30};


         int divisor = 0;
         int index = 2;

         try {
             int result = numbers[index] / divisor;
             System.out.println("Result: " + result);
             System.out.println("Program finished successfully!");
         }  catch (ArithmeticException e) {
             System.out.println("Exception catch");
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println();
         }







     }
}





//  Q2. Array Exception
//Create array of size 5
//Ask user for index
//Print element
//
//Handle:
//
//Invalid index
//Wrong input type