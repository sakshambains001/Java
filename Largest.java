import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First element");
        int a = sc.nextInt();
        System.out.println("Enter Second element");
        int b = sc.nextInt();
        System.out.println("Enter Third element");
        int c = sc.nextInt();
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest = " + largest);
    }
}
