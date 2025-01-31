package Library;

public abstract class User {
	protected String name;
	protected String email;
	protected String phonenumber;
	protected IOOperations[] operations;
	
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, String email, String phonenumber) {
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public String getEmail() {
		return email;
	}
	
	abstract public String toString();

	protected abstract void menu(Database database, User user);
}
