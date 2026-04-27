import java.util.Scanner;

public class SimpleAttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total classes: ");
        int totalClasses = sc.nextInt();
        System.out.print("Enter classes attended: ");
        int attendedClasses = sc.nextInt();
        
        double percentage = (attendedClasses * 100.0) / totalClasses;
        System.out.println("Attendance: " + String.format("%.2f", percentage) + "%");
    }
}
