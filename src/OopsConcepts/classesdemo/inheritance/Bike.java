package OopsConcepts.classesdemo.inheritance;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed) {
        super(brand, speed);
        this.hasCarrier = isHasCarrier();

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
        System.out.println("brand: " + getBrand() + ", speed: " + getSpeed() + "hm/hr ");
    }
}