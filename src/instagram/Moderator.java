package instagram;

/**
 * A moderator user who can moderate the posts and users.
 */
public class Moderator extends AbstractUser {
    public void activateUser(User user) {
        user.setActive(true);
    }

    public void suspendUser(User user) {
        user.setActive(false);
    }

    public void activatePost(Post post) {
        post.setActive(true);
    }

    public void suspendPost(Post post) {
        post.setActive(false);
    }

    public void activateComment(Comment comment) {
        comment.setActive(true);
    }

    public void suspendComment(Comment comment) {
        comment.setActive(false);
    }
}
