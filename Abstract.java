
interface I1 {
    int length = 4; 
    void run();     
}

// Define interface I2
interface I2 {
    void engine();  
}


class Car implements I1, I2 {
    
    public void run() {
        System.out.println("It runs at amazing speed");
    }

    // Implement engine() from I2
    public void engine() {
        System.out.println("It consists of an engine");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.engine();

        
        System.out.println("Length from I1: " + I1.length);
    }
}
