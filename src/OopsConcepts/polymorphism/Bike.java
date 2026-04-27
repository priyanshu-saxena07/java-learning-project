package OopsConcepts.polymorphism;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }
    @Override
    public void start() {
        System.out.println("Starting  Bike....");
    }

    public void start(String great) {
        System.out.println("Starting Bike...." + great);
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("brand: " +getBrand() + ", Speed: " + getSpeed() + "hm/hr 5 " + hasCarrier);
    }
}
