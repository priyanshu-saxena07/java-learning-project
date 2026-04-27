package Java8Features;

@FunctionalInterface
interface BookAction {
    void perform();
}

// functional Interface with Parameters
@FunctionalInterface
interface Operation{
    int add(int a, int b);
}


// parameter -> expression body
// ( -> {

public class FunctionallnterfaceDemo {
    public static void main(String[] args) {
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action Performed");
            }
        };
        // step 2
        BookAction action2 = () -> {
            System.out.println("Action Performed");

        };

        // step 3
        BookAction action3 = () -> System.out.println("Action Performed");
        action3.perform();



        Operation operation1 =  (int a, int b) -> {
                return a + b;
        };
        System.out.println(operation1.add(10,20));

        // THREAD INTERFACE;
        new Thread(() -> System.out.println("New Thread created")).start();


    }
}
