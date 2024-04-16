package basics;

import java.util.Date;
import java.awt.Point;

public class VariablesAndDataTypesExamples {
	
	public static void main(String[] args) {
		
		// Primative Data Types
		byte age = 25;
		long population = 7_000_000_000L;
		float pi = 3.14F;
		char grade = 'A';
		boolean isMarried = true;
		System.out.println(age);
		System.out.println(population);
		System.out.println(pi);
		System.out.println(grade);
		System.out.println(isMarried);

		// non-primative data types
		String name = "John";
		System.out.println(name);
		
		Date now = new Date();
		System.out.println(now);

		Point p = new Point(10, 20);
		Point p2 = p;
		//p2 is reeferenced to p not the value
		System.out.println(p.x + " " + p.y);
		System.out.println(p2.x + " " + p2.y);
		//this changes p and p2
		p.y = 30;
		System.out.println(p.x + " " + p.y);
		System.out.println(p2.x + " " + p2.y);


	}
}
