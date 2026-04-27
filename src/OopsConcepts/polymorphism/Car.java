package OopsConcepts.polymorphism;

public class Car extends Vehicle {
    private int doors;


    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }
    @Override
    public void start() {
        System.out.println("Starting Car....");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("brand: " +getBrand() + ", Speed: " + getSpeed() + "hm/hr 5 " + doors + "doors");
    }
}
