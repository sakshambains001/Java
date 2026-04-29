// Parent class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting from Person
class Student extends Person {
    int rollNo;
    double marks;

    // Constructor for Student
    Student(String name, int age, int rollNo, double marks) {
        // Call parent constructor using super
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    void displayStudentInfo() {
        // Reuse parent method
        super.displayInfo();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Demo class
public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Saksham", 22, 101, 88.5);
        s1.displayStudentInfo();
    }
}
