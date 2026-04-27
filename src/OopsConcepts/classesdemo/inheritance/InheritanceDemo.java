package OopsConcepts.classesdemo.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", -200,5);
        c1.displayInfo();
        c1.increaseSpeed(-250);

        Bike b1 = new Bike("hero",20);
        b1.displayInfo();

    }
}