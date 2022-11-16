package instagram;

import java.util.Date;
import java.util.List;

public class Post {
    private User owner;
    private Date postDateTime;
    private String caption;
    private String contents;
    private List<Like> likes = new ArrayList();
    
}
