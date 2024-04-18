package basics;

public class StringManipulations {

    public static void main(String[] args) {
        String name = "John";
        String surname = new String("Doe");
        String fullName = name + " " + surname;
        
        System.out.println(fullName);
        System.out.println(name + " " + surname);
    
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.substring(0, 3));
        System.out.println(fullName.replace("Doe", "Doe Jr."));
        System.out.println(name.concat(" " + surname));

        System.out.println(fullName.trim());
        System.out.println(fullName.compareTo(name + " " + surname));
        System.out.println(fullName.equals(name + "  " + surname));
        System.out.println(fullName.contains(name));

        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());

    }
    }
