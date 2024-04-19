package basics;

class person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;   
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
public class EncapsulationExample {

    public static void main(String[] args) {

        person p = new person();

        p.setFirstName("John");
        p.setLastName("Doe");
        p.setAge(-30);

        System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge());


    }
}
