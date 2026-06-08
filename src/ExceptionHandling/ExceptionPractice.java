package ExceptionHandling;

public class ExceptionPractice {
    @SuppressWarnings("DataFlowIssue")
    public static void main(String[] args) {


        String text = null;

        try {
            System.out.println(text.toUpperCase());
            System.out.println("Program finished successfully!");
        } catch (NullPointerException e) {
            System.out.println("Error: Object is null!");
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