package ooplntro;

public class Category {
      private int id;//kategor�n�n fakt�rleri; id, �nem s�ras� vb
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
