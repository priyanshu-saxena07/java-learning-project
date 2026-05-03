package Java8Features.inbuild;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class lambdaDemo {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1545,"Avni",45000),
                new Employee(1705,"Priyanka",55000),
                new Employee(1195,"Amit",105000),
                new Employee(1195,"Shana ya",120000),
                new Employee(1195,"Rahul",140000)
        );

        Employee maxEmp = list.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow();

        Employee minEmp = list.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow();


        System.out.println("Name: " + maxEmp.getName() + ", Salary " + maxEmp.getSalary());
        System.out.println("Name: " + minEmp.getName() + ", Salary " + minEmp.getSalary());
    }
}

        //  Find employee whose name is "Amit"

//      Employee minEmp = list.stream()
//        .min(Comparator.comparing(Employee::getSalary))
//        .get();
//
//System.out.println(minEmp.getName());
