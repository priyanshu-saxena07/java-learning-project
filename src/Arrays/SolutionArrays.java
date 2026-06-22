package Arrays;

public class SolutionArrays {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int num : numbers) {
            if (num % 2 == 0) {
                int squared = num * num;
                System.out.println(squared);
            }
        }

    }
}

