package ooplntro;

public class Category {
      private int id;//kategorýnýn faktörleri; id, önem sýrasý vb
      private String name;
       public Category() {
    	   
       }
      
      public Category(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
    	  return this.id;
      }
      
      
      public String getName() {
    	  return name+ "!";
      }
      
      public void setName(String name) {
    	  this.name=name;
      }
}
