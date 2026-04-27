class Car {
    void drive() { System.out.println("Car is driving"); }
}

class ElectricCar extends Car {
    void charge() { System.out.println("Charging battery"); }
}

public class Test {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.drive();
        e.charge();
    }
}
