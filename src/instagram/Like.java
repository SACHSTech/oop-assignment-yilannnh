package instagram;

import java.util.Date;

public class Like {
    private Post post;
    private User user;
    private Date likeDateTime;

    public Like() {

    }

    public Like(Post post, User user) {
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

    public Date getLikeDateTime() {
        return this.likeDateTime;
    }

    public void setLikeDateTime(Date likeDateTime) {
        this.likeDateTime = likeDateTime;
    }
    
}
