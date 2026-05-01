
class Account {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Camera {
    public void capture() {
        System.out.println("Camera captures a photo.");
    }
}

interface WideCapture {
    void wideCapture();
}

interface Video {
    void capture();
}

class Mobile implements WideCapture, Video {
    @Override
    public void wideCapture() {
        System.out.println("Mobile captures wide-angle photos.");
    }

    @Override
    public void capture() {
        System.out.println("Mobile records video at 4K resolution.");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation demo
        Account acc = new Account();
        acc.setBalance(5000.75);
        System.out.println("Account Balance: " + acc.getBalance());

        // Camera demo
        Camera cam = new Camera();
        cam.capture();

        // Mobile demo
        Mobile mob = new Mobile();
        mob.wideCapture();
        mob.capture();
    }
}
