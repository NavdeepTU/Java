package bank;

// Access Modifiers
// public is accessible to everywhere (within the class and outside the package)
// default is accessible only within the package
// protected is accessible within the package and to the subclasses outside the package
// private is accessible only within the class (not accessible within the package)

// Encapsulation -> It means combining data and methods associated with it. (eg: classes)
// It enables data hiding using access modifiers

public class Account {
	
	public String name; 
	protected String email;
	private String password;
	
	// getters and setters
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
}