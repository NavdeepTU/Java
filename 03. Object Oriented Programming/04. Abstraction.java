// Abstraction -> Hiding the implementation details and showing only important/useful parts to the user.
// 2 ways to implement abstraction -> 1. Using abstract keyword 2. Using interfaces

// Abstract class is just a concept. We cannot create object of that class
// It can have abstract and non-abstract methods.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.

abstract class Animal { 
	abstract void walk();  // functions can also be abstract -> Any class that extends Animal class will have to define it as well.
	
	Animal() {
		System.out.println("You are creating a new Animal");
	}
	
	public void eat() {
		System.out.println("Animal Eats");
	}
}

class Horse extends Animal {
	Horse() {
		System.out.println("Created a horse");
	}
	
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}

class Chicken extends Animal {
	public void walk() {
		System.out.println("Walks on 2 legs");
	}
}

class Abstraction {
	public static void main (String[] args) {
		Horse horse = new Horse(); // constructor of base class will be called first then sub class -> constructor chaining
		horse.walk();
		horse.eat();
		
		// Abstraction
		//Animal animal = new Animal(); // runtime error : Animal is abstract; cannot be instantiated
		//animal.walk();
	}
}