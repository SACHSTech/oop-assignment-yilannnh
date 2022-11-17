package instagram;

import java.util.Calendar;
import java.util.Date;

public class Comment {
    private boolean active;
    private Post post;
    private User user;
    private String text;
    private Date commentDateTime;

    public Comment() {

    }

    public Comment(Post post, User user, String text) {
        this.post = post;
        this.user = user;
        this.text = text;

        Calendar cal = Calendar.getInstance();
        this.commentDateTime = cal.getTime();        
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCommentDateTime() {
        return this.commentDateTime;
    }

    public void setCommentDateTime(Date commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}