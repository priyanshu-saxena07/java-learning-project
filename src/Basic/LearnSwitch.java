package Basic;

import java.util.Scanner;

public class LearnSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

//        if(day == 1) {
//            System.out.println("today is Sun");
//        }

        switch(day) {
            case 1:
                System.out.println("today is Sunday");
                break;
            case 2:
                System.out.println("today is Monday");
                break;
            case 3:
                System.out.println("today is tusday");
                break;
            case 4:
                System.out.println("today is Wednesday");
                break;
            case 5:
                System.out.println("today is thursday");
                break;
            case 6:
                System.out.println("today is Friday");
                break;
            case 7:
                System.out.println("today is Saturday");
                break;
        }
    }
}
