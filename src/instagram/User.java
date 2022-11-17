package instagram;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class User extends AbstractUser {
    private boolean active;
    private String profilePictureUrl;
    private List<User> followers = new ArrayList<>();
    private List<User> following = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public User(String username) {
        setUsername(username);
    }

    public void display() {
        System.out.println("****************************************");
        System.out.println(getUsername());

        int postCount = 0;
        for (Post post : getPosts()) {
            if (post.isActive())
                postCount++;
        }

        int followersCount = 0;
        for (User follower : getFollowers()) {
            if (follower.isActive())
                followersCount++;
        }
        
        int followingCount = 0;
        for (User following : getFollowing()) {
            if (following.isActive())
                followingCount++;
        }
        System.out.println("Posts: " + postCount + ", followers: " + followersCount + ", following: " + followingCount);

        System.out.println("****************************************");

        for (Post post : getPosts()) {
            if (post.isActive())
                post.display();
        }
        System.out.println("****************************************");
    }

    public Post createPost(String caption, String contents) {
        Calendar cal = Calendar.getInstance();
        Post post = new Post();
        post.setCaption(caption);
        post.setContents(contents);
        post.setActive(true);
        post.setPostDateTime(cal.getTime());

        posts.add(post);
        
        return post;
    }

    public void deletePost(Post post) {
        for (Post p : posts) {
            if (p.equals(post))
                posts.remove(p);
        }
    }

    public void likePost(Post post) {
        Like like = new Like(post, this);

        post.getLikes().add(like);
    }

    public void addComment(Post post, String comment) {
        Comment c = new Comment(post, this, comment);
        post.getComments().add(c);
    }

    public void follow(User user) {
        following.add(user);
        user.getFollowers().add(this);
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }
    public void setFollowing(List<User> following) {
        this.following = following;
    }
    public void setPosts(List<Post> posts) {
        this.posts = posts;
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
