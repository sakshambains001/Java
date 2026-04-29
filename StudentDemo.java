
class Student {
    
    int rollNo;
    String name;
    double marks;

    // Constructor to initialize student details
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Saksham", 89.5);


        s1.display();
    }
}
