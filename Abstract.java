// Define interface I1
interface I1 {
    int length = 4; // constants in interfaces are implicitly public, static, and final
    void run();     // abstract method
}

// Define interface I2
interface I2 {
    void engine();  // abstract method
}

// Car class implements both interfaces
class Car implements I1, I2 {
    // Implement run() from I1
    public void run() {
        System.out.println("It runs at amazing speed");
    }

    // Implement engine() from I2
    public void engine() {
        System.out.println("It consists of an engine");
    }
}

// Main class to test Car
public class Abstract {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.engine();

        // Accessing interface constant
        System.out.println("Length from I1: " + I1.length);
    }
}
