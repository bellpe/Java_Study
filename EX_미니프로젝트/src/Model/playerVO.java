package Model;

public class playerVO {
	private String name;
	  
	  private int ability;
	  
	  private String id;
	  
	  public playerVO(String name, int ability) {
	    this.name = name;
	    this.ability = ability;
	  }
	  
	  public playerVO(String name, String id, int ability) {
	    this.name = name;
	    this.ability = ability;
	    this.id = id;
	  }
	  
	  public String getName() {
	    return this.name;
	  }
	  
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public int getAbility() {
	    return this.ability;
	  }
	  
	  public void setAbility(int ability) {
	    this.ability = ability;
	  }
	  
	  public String getId() {
	    return this.id;
	  }
	  
	  public void setId(String id) {
	    this.id = id;
	  }

}
