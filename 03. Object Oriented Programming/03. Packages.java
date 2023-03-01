import bank.*;

class Packages {
	public static void main (String[] args) {
		Account account1 = new Account();
		account1.name = "Apna College";
		// account1.email = "apnacollege@gmail.com"; // error : email has protected access in bank.Account
		// account1.password = "abcd"; // error : password has private access in bank.Account
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
	}
}