package tutorial.core.model.entities;

public class Blog {
	
	Long id;
	
	String title;
	
	Account owner;
	
	
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Account getOwner() {
		return owner;
	}
	
	
	public void setOwner(Account owner) {
		this.owner = owner;
	}
	
	
	

}
