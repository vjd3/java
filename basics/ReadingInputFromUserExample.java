package basics;

import java.util.Scanner;
public class ReadingInputFromUserExample {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        
        System.out.print("Enter your phone number: ");
        double phoneNumber = scanner.nextDouble();
   
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You are " + gender);
        System.out.println("Your phone number is " + phoneNumber);

        scanner.close();
        
    }
}
