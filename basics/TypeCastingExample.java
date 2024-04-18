package basics;
public class TypeCastingExample {
    
    public static void main(String[] args) {
        
        int intValue = 100;
        
        //implicit type casting from integer to long
        long longValue = intValue;

        //implicit type casting from long to double
        double doubleValue = longValue;
        
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        
        double doubleValue2 = 200.56;

        //explicit type casting double to long
        long longValue2 = (long) doubleValue2;

        //explicit type casting double to int
        int intValue2 = (int) doubleValue2;

        //explicit type casting double to byte
        byte byteValue2 = (byte) doubleValue2;

        System.out.println(doubleValue2);
        System.out.println(longValue2);
        System.out.println(intValue2);
        System.out.println(byteValue2);
    }
}
