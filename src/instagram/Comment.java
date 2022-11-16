package instagram;

import java.util.Date;

public class Comment {
    private Post post;
    private User user;
    private Date commentDateTime;

    public Comment() {

    }

    public Comment(Post post, User user) {
        this.post = post;
        this.user = user;
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
}