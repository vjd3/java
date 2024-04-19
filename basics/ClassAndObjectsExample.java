package basics;

import java.util.Scanner;

class student {
    
    //Data members
    int studentId;
    String studentName;
    int studentAge;

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
        s1.acceptDetails();
        s1.displayDetails();
    }

}
