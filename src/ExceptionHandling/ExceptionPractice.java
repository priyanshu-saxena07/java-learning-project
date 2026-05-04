package ExceptionHandling;

public class ExceptionPractice {
    public static void main(String[] args) {


        try {
            int[] arr = {5, 8 ,9, 7};
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        } finally {
            System.out.println("Program finished execution");
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