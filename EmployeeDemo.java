
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double ratePerHour;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double ratePerHour, int hoursWorked) {
        super(name, id);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return ratePerHour * hoursWorked;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Saksham", 101, 50000);
        PartTimeEmployee pte = new PartTimeEmployee("Harsh", 102, 500, 40);

        System.out.println("Full-Time Employee:");
        fte.displayInfo();

        System.out.println("\nPart-Time Employee:");
        pte.displayInfo();
    }
}
