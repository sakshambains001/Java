import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble();
        
        // Conversion factor: 1 inch = 0.0254 meters
        double meters = inches * 0.0254;
        
        System.out.printf("%.2f inches = %.4f meters%n", inches, meters);
        
        scanner.close();
    }
}
