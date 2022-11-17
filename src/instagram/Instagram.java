package instagram;

public class Instagram {
    public static void main(String[] args) {

        Moderator mod1 = new Moderator();
        User user1 = new User("_catlover445_");

        User user2 = new User("alex.g.");

        User user3 = new User("4n1m4l_h4t3rz");

        Post post = user1.createPost("I got a new cat guys ^_^", "Soooo cutee! What should I name her??");

        user2.likePost(post);
        Comment user2Comment = new Comment();
        user2.addComment(post, user2Comment);
        user2.follow(user1);

        Comment user3Comment = new Comment();
        user3.addComment(post, user3Comment);
        user3.follow(user1);

        user1.display();

        mod1.suspendComment(user3Comment);

        user1.display();

        mod1.suspendUser(user3);

        user1.display();
    }
}
