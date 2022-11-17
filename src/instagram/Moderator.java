package instagram;

public class Moderator extends AbstractUser {
    public void suspendUser(User user) {
        user.setActive(false);
    }

    public void suspendComment(Comment comment) {
        comment.setActive(false);
    }
}
