package basics;

public class OperatorsExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;
        boolean tr = true;
        boolean fa = false;
        boolean isAuthenticated = false;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));

        System.out.println("a * b: " + (a * b));
        System.out.println("b / a: " + (b / a));
        System.out.println("b % a: " + (b % a));
        System.out.println("++a: " + (++a));
        System.out.println("--a: " + (--a));
        System.out.println("a++: " + (a++));
        System.out.println("a--: " + (a--));

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));
        System.out.println("a >>> 2: " + (a >>> 2));
        System.out.println("a |= b: " + (a |= b));
        System.out.println("a &= b: " + (a &= b));
        System.out.println("a ^= b: " + (a ^= b));
        System.out.println("a >>= 2: " + (a >>= 2));
        System.out.println("a <<= 2: " + (a <<= 2));
        System.out.println("a >>>= 2: " + (a >>>= 2));

        System.out.println("true && false: " + (tr && fa));
        System.out.println("true || false: " + (tr || fa));
        System.out.println("!true: " + (!tr));
        
        if(isAuthenticated)
            System.out.println("You are logged in successfully");
        else
            System.out.println("You are not logged in successfully");

        String result = (isAuthenticated) ? "You are logged in successfully" : "You are not logged in";
        System.out.println(result);


    }
}
