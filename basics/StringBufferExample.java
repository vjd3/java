package basics;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());

        sb.append("World");
        System.out.println(sb); // HelloWorld   
        
        System.out.println(sb.capacity());

        sb.insert(5, " ");
        System.out.println(sb); // Hello World

        sb.delete(5, 11);
        System.out.println(sb); // Hello

        sb.reverse();
        System.out.println(sb); // olleH

        sb.setLength(2);
        System.out.println(sb); // ol

        sb.setLength(0);
        System.out.println(sb);

        sb.trimToSize();
        System.out.println(sb);

    }
}
