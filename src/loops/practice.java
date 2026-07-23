package loops;

public class practice {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 3; i ++) {
            if (i == 2) {
                continue;
            }
            count = count + i;
        }
        System.out.println(count);


    }
}
