package instagram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private boolean active;
    private User owner;
    private Date postDateTime;
    private String caption;
    private String contents;
    private List<Like> likes = new ArrayList<Like>();
    private List<Comment> comments = new ArrayList<Comment>();


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
        System.out.println(owner.getUsername() + " posted " + getCaption() + " at " + getPostDateTime());

        System.out.println(getContents());
        System.out.println("Likes: ");
        for (Like like : likes) {
            System.out.print(like.getUser().getUsername() + " ");
        }

        for (Comment comment : comments) {
            if (comment.isActive()) {
                System.out.println(comment.getUser().getUsername() + " commented at " + comment.getCommentDateTime() + ": ");
                System.out.println(comment.getText());    
            }
        }
    }
}
