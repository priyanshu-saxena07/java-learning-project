package Collections;

import java.util.ArrayList;
import java.util.List;

class Car{
    String brand;
    Car (String brand){
        this.brand = brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {
    List<String> users = new ArrayList();
     users.add("Priyanshu");
     users.add("Anamika");
     users.add("Avni");
     users.add("Madhav");
//     users.add(1);

        System.out.println("All Users");
        for (String user : users) {
            System.out.println(user);
        }

        System.out.println("Element using index: " + users.get(2));


        // List of objects
        Car car1 = new Car("kia");
        Car car2 = new Car("Mahindra");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        System.out.println("All  Cars");
        for (Car car : carList) {
            System.out.println(car.brand);
        }
    }
}