// Abstract class Student
abstract class Student {
    // Data members
    int rollNo;
    int regNo;

    // Abstract method
    abstract void course();
}

// Subclass Kiitian extending Student
class Kiitian extends Student {
    // Implementation of abstract method
    void course() {
        System.out.println("Course: B.Tech in Computer Science");
    }
}

// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        // Creating an object of subclass Kiitian
        Kiitian student1 = new Kiitian();

        // Assigning values to data members
        student1.rollNo = 101;
        student1.regNo = 123456;

        // Calling the course() method
        student1.course();


        // Displaying roll no and registration no
        System.out.println("Roll No: " + student1.rollNo);
        System.out.println("Registration No: " + student1.regNo);
    }
}
