package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void main(String[] args) {
//    int a = 10;
//    int result = 10 / 0;
//        System.out.println("done");

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("In catch block");
        }
        System.out.println("Done");

        int[] a = {1,2,3,};
        try {
            System.out.println(a[1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        } catch (Exception e) {
            System.out.println("");
        } finally {
            System.out.println("FINALLY");
        }

        try {
            FileReader fileReader = new FileReader("abc.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
        }
    }
}
