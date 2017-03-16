package tutorial.core.services.util;

import tutorial.core.model.entities.Blog;
import java.util.ArrayList;
import java.util.List;


public class BlogList {

    private List<Blog> blogs = new ArrayList<Blog>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}