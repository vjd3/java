package basics;

/* 
class calculations {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float add(float a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }
}
*/
class myPerson {
    String name;
    int age;
    public myPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Employee extends myPerson {
    String designation;
    float salary;
    
    public Employee(String name, int age, String designation, float salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public void printPerson() {
        super.printPerson(); 
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}
public class Overloading {
    
    public static void main(String[] args) {

        /*System.out.println(calculations.add(10, 20));
        System.out.println(calculations.add(10, 20, 30));
        System.out.println(calculations.add(10.0f, 20.0f));
        System.out.println(calculations.add(10, 20.0f));
        System.out.println(calculations.add(10.0f, 20));*/

        Employee employee = new Employee("John", 25, "Manager", 50000.0f);
        employee.printPerson();
    }

}
