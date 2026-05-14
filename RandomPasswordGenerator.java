import java.security.SecureRandom;

public class RandomPasswordGenerator {
    private static final String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static void main(String[] args) {
        int length = 12;
        if (args.length > 0) {
            try {
                length = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid length argument, using default 12.");
            }
        }

        String password = generatePassword(length);
        System.out.println("Generated password: " + password);
    }

    private static String generatePassword(int length) {
        StringBuilder pwd = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            pwd.append(CHAR_SET.charAt(RANDOM.nextInt(CHAR_SET.length())));
        }
        return pwd.toString();
    }
}
