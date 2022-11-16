package instagram;

import java.util.ArrayList;
import java.util.List;

public class User extends AbstractUser {
    private String profilePictureUrl;
    private List<User> followers = new ArrayList<>();
    private List<User> following = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public User() {

    }

    public void createPost(Post post) {

    }

    public void deletePost(Post post) {

    }

    public void likePost(Post post) {

    }

    public void addComment(Post post, Comment comment) {

    }

    public void follow(User user) {

    }

    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public List<User> getFollowers() {
        return this.followers;
    }


    public List<User> getFollowing() {
        return this.following;
    }


    public List<Post> getPosts() {
        return this.posts;
    }

}
