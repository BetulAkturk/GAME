package game;

public class Gamer {
      int id;
     private  String firstName;
     private  String lastName;
     private String birdDate;
     private String email;
      
      
	public Gamer() {
		super();
	}


	public Gamer(int id, String firstName, String lastName, String birdDate, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birdDate = birdDate;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getBirdDate() {
		return birdDate;
	}


	public void setBirdDate(String birdDate) {
		this.birdDate = birdDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
      
}
