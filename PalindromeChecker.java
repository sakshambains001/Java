import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();
        
        if (word.equals(reversed)) {
            System.out.println("\"" + word + "\" is a Palindrome!");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome!");
        }
    }
}
