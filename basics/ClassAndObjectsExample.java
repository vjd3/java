package basics;

import java.util.Scanner;

class student {
    
    //Data members
    private int studentId;
    private String studentName;
    private int studentAge;

    public student() {
        
        this.studentId = 100;
        this.studentName = "Unknown";
        this.studentAge = 18;
    }   
    
    public student(int studentId, String studentName, int studentAge) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    Scanner scanner = new Scanner(System.in);

    //Member function
    public void acceptDetails() {
        
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter your id: ");
        studentId = scanner.nextInt();
        System.out.print("Enter your age: ");
        studentAge = scanner.nextInt();


    }

    public void displayDetails() {

        System.out.println("Name: " + studentName);
        System.out.println("Id: " + studentId);
        System.out.println("Age: " + studentAge);

    }

}
public class ClassAndObjectsExample {

    public static void main(String[] args) {

        student s1 = new student();
        //s1.acceptDetails();
        s1.displayDetails();

        student s2 = new student(101, "John", 20);
        //s2.acceptDetails();
        s2.displayDetails();
    }

}
