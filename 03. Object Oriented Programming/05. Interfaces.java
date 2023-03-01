
// Interfaces allow pure abstraction
// Interfaces cannot have constructors
// They cannot contain non-abstract functions

interface Animal {
	int eyes = 2; // All the fields in interfaces are public, static and final by default
	void walk(); // All methods are public and abstract by default
}

interface Herbivore {
	
}

// multiple inheritance(A class having more than 1 base class) can be achieved using interfaces.
class Horse implements Animal, Herbivore {
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}

// static variables and methods -> common for all objects
class Student {
	String name;
	static String school;  // memory assigned only 1 time
	
	public static void changeSchool() {  // static methods can only use static variables
		school = "newschool";
	}
}

class Interfaces {
	public static void main (String[] args) {
		Horse horse = new Horse();
		horse.walk(); // Walks on 4 legs
		
		Student.school = "JMV";
		Student student1 = new Student();
		student1.name = "tony";
		System.out.println(student1.school);  // JMV
	}
}