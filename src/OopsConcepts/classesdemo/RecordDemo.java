package OopsConcepts.classesdemo;

record  Bike1(String brand, int speed) {}

record Bike(String brand, int speed) {

    public Bike {
        if (speed < 0) {
            speed = 0;
        }
    }
}

public class RecordDemo {
    public static void main(String[] args) {
       Bike bike = new Bike("bmw",-150);
        System.out.println("brand: " + bike.brand());
        System.out.println("Speed: " + bike.speed());
        System.out.println(bike);




    }
}
