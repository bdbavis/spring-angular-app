package tutorial.core.services;

import tutorial.core.entities.BlogEntry;

public class BlogEntryServiceImp implements BlogEntryService{

	@Override
	public BlogEntry find(Long id) {

		BlogEntry entry= new BlogEntry();
		entry.setId(1L);
		entry.setTitle("This is a blog entry");
		return entry;
	}
	
	

}
