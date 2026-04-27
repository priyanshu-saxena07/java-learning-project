package LearnString;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your firts name");
//        String firstName = sc.nextLine();
//
//        System.out.println("Enter your Last name");
//        String LastName = sc.nextLine();
//
//        System.out.println("your fullName is "+firstName+" "+LastName);

//         int age = 123;
//         String stringAge = String.valueOf(age);
//        System.out.println(age+2);
//        System.out.println(stringAge+2);

        String  sentence = "l love java, java, is a good lauge";

        String newSentence = sentence.replace("java","cpp");
        System.out.println(sentence);
        System.out.println(newSentence);

        System.out.println(sentence.contains("java"));






    }
}
