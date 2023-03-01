import java.util.*; // importing all the classes from java.util package
// package contains related code

class Shape {
	String color;
	
	public void area() {
		System.out.println("displays area");
	}
}

// Single level Inheritance
class Triangle extends Shape {  // Triangle class will have all the properties and methods that Shape class has -> this is known as Inheritance
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

// Multilevel Inheritance
class EquilateralTriangle extends Triangle { // EquilateralTriangle class will have all the properties and methods that Triangle and Shape class has
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

// Hierarchical Inheritance -> Shape class is inherited by Triangle and Circle class
class Circle extends Shape {
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}

// Hybrid Inheritance -> Mixture of all the the above types of Inheritance

// Multiple Inheritance -> Not directly possible in Java, possible through Interfaces

public class Inheritance {
	public static void main (String[] args) {
		Triangle t1 = new Triangle();
		t1.color = "red";
	}
}