package kodlama›o;

public class User {
	private int id;
	private String email;
    private String phoneNumber;
	
	public User() {
		super();
	}

	public User(int id, String email, String phoneNumber) {
		super();
		this.id = id;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    
}
