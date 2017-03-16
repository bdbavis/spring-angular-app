package tutorial.rest.resources.asm;


import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.Link;

import tutorial.core.entities.BlogEntry;
import tutorial.rest.mvc.BlogEntryController;
import tutorial.rest.resources.BlogEntryResource;


public class BlogEntryResourceAssembler extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource> 
{
	public BlogEntryResourceAssembler()
	{
		super(BlogEntryController.class,BlogEntryResource.class);
	}

	@Override
	public BlogEntryResource toResource(BlogEntry entity) {
		BlogEntryResource resource = new BlogEntryResource();
		resource.setTitle(entity.getTitle());
		Link link = linkTo(methodOn(BlogEntryController.class).getBlogEntry(entity.getId())).withSelfRel();
		resource.add(link.withSelfRel());
		
		return resource;
	}
	
	
}
