package Java8Features.intermediate;
import java.util.*;

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

public class EmployeeDashboard {
    public static void main(String[] args) {
    List<Employee>  list = Arrays.asList(
         new Employee(1,"Priyanka",80000),
         new Employee(2,"Ravi",120000),
         new Employee(3,"Avni", 50000),
         new Employee(4,"Pooja", 45000)
    );

        Employee maxEmp = list.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow();

          list.stream()
                  .filter(e -> e.getName().startsWith("P")
                          || e.getName().startsWith("A"))
                  .forEach(e -> System.out.println(e.getName()));



        System.out.println("Name: " + maxEmp.getName() + " salary: " + maxEmp.getSalary());




    }
}

//      long count = list.stream()
//    .filter(e -> e.getSalary() > 50000)
//    .count();
//
//System.out.println("Count: " + count);

//List<Employee> employees = Arrays.asList(
//        new Employee(1, "Amit", 50000),
//        new Employee(2, "Rahul", 70000),
//        new Employee(3, "Neha", 60000),
//        new Employee(4, "Priya", 90000)
//);
//
//double avgSalary = employees.stream()
//        .mapToDouble(Employee::getSalary)
//        .average()
//        .orElse(0);
//
//        System.out.println("Average Salary: " + avgSalary);
//
//Employee highestPaid = employees.stream()
//        .max(Comparator.comparing(Employee::getSalary))
//        .orElse(null);
//
//        System.out.println("Highest Paid Employee: "
//                                   + highestPaid.getName()
//                + " - " + highestPaid.getSalary());