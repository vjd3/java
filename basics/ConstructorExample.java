package basics;

 class ConstructorExample {
    
    String languages;

    ConstructorExample(String lang) {
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    /**
     * The main method is the entry point of the program.
     * It creates an object of the class ConstructorExample and calls its constructor.
     * @param args Default parameter of main method
     */
    public static void main(String[] args) {
        // Create an object of ConstructorExample and call its constructor
        ConstructorExample obj = new ConstructorExample("Java");
        // Create an object of ConstructorExample and call its constructor
        ConstructorExample obj2 = new ConstructorExample("C++");
        // Create an object of ConstructorExample and call its constructor
        ConstructorExample obj3 = new ConstructorExample("Python");

        System.out.println(obj.languages);
        System.out.println(obj2.languages);
        System.out.println(obj3.languages);

    }


}
