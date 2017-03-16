package tutorial.rest.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tutorial.core.model.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.core.services.BlogEntryServiceImp;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.asm.BlogEntryResourceAssembler;

@Controller
@RequestMapping("/rest/blog-entries")
public class BlogEntryController {
	
	BlogEntryService service;
	
	public BlogEntryController()
	{
		this.service = new BlogEntryServiceImp();
	}
	
    @RequestMapping("/{blogEntryId}")
    public @ResponseBody BlogEntryResource getBlogEntry(@PathVariable Long blogEntryId)
    {
    	BlogEntry entry= service.findBlogEntry(blogEntryId);
        BlogEntryResourceAssembler asm = new BlogEntryResourceAssembler();
        BlogEntryResource resource = asm.toResource(entry);
        return resource;
    }
}
