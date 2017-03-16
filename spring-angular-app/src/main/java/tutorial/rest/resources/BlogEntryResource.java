package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

public class BlogEntryResource extends ResourceSupport{
	
	String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
