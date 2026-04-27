import java.util.Scanner;

public class InchesToMetres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 inch = 0.0254 metres
        System.out.print("Enter length in inches: ");
        double inches = sc.nextDouble();

        double metres = inches * 0.0254;

        System.out.printf("%.2f inches = %.4f metres%n", inches, metres);

        sc.close();
    }
}