import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in USD: $");
        double usd = sc.nextDouble();
        
        double inr = usd * 83.5;
        double eur = usd * 0.92;
        double gbp = usd * 0.79;
        
        System.out.println("USD to INR: ₹" + inr);
        System.out.println("USD to EUR: €" + eur);
        System.out.println("USD to GBP: £" + gbp);
    }
}
