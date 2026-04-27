package Basic;
import java.util.Scanner;
public class Usserinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age;");
//        int age = sc.nextInt();
//        System.out.println("your age is "+age);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int result = firstNumber+secondNumber;
        System.out.println(result);
    }
}
