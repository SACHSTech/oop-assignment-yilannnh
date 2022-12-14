package instagram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a Post.
 */
public class Post {
    private boolean active;
    private User owner;
    private Date postDateTime;
    private String caption;
    private String contents;
    private List<Like> likes = new ArrayList<Like>();
    private List<Comment> comments = new ArrayList<Comment>();

    // Getter and setter methods
    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Date getPostDateTime() {
        return this.postDateTime;
    }

    public void setPostDateTime(Date postDateTime) {
        this.postDateTime = postDateTime;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public List<Like> getLikes() {
        return this.likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void display() {
        System.out.println(owner.getUsername() + " posted [" + getCaption() + "] at " + getPostDateTime());

        // Contents of post
        System.out.println("\"" + getContents() + "\"");
        System.out.println("");
        System.out.print("Likes <3: ");
        
        // Who liked the post?
        for (Like like : likes) {
            System.out.print(like.getUser().getUsername() + " ");
        }

        System.out.println("");
        System.out.println("");

        // Shows a comment and the date and time
        for (Comment comment : comments) {
            if (comment.isActive()) {
                System.out.print(comment.getUser().getUsername() + " commented at " + comment.getCommentDateTime() + ": ");
                System.out.println("\"" + comment.getText() + "\"");    
            }
        }
    }
}
