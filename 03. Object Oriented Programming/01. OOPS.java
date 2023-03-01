class Pen {
	
	// defining properties of a Pen
	String color;
	String type; // ballpoint; gel
	
	// defining methods that a Pen object can perform
	public void write() {
		System.out.println("writing something");
	}
	
	public void printColor() {
		System.out.println(this.color); // this refers to the current object
	}
}

class Student {
	
	String name;
	int age;
	
	// non parameterized constructor
	Student() {
		System.out.println("constructor called");
	}
	
	// parameterized constructor
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// copy constructor (copying info of object passed to current object)
	Student(Student s2) {
		this.name = s2.name;
		this.age = s2.age;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// this is known as function overloading(when functions have same name in same class) -> compile time polymorphism
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
}

public class OOPS { // if a class is public, it should have same name as that of the file
	public static void main (String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		pen1.write(); // writing something
		
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		
		pen1.printColor(); // blue
		pen2.printColor(); // black
		
		//Student s1 = new Student();
		//s1.name = "aman";
		//s1.age = 24;
		
		//s1.printInfo();
		
		Student s2 = new Student("Shraddha", 22);
		s2.printInfo();
		
		Student s3 = new Student(s2);
		s2.printInfo();
	}
}