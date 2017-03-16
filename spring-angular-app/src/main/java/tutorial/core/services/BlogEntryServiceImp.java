package tutorial.core.services;

import tutorial.core.model.entities.BlogEntry;

public class BlogEntryServiceImp implements BlogEntryService{

	@Override
	public BlogEntry findBlogEntry(Long id) {
		BlogEntry entry= new BlogEntry();
		entry.setId(1L);
		entry.setTitle("This is a blog entry");
		return entry;
	}

	@Override
	public BlogEntry deleteBlogEntry(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogEntry updateBlogEntry(Long id, BlogEntry data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
