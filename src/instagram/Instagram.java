package instagram;

public class Instagram {
    public static void main(String[] args) {

        Moderator mod1 = new Moderator();
        User user1 = new User("_catlover445_");

        User user2 = new User("alex.g.");

        User user3 = new User("4n1m4l_h4t3rz");

        Post post = user1.createPost("I got a new cat guys ^_^", "Soooo cutee! What should I name her??");

        user2.likePost(post);
        user2.addComment(post, "That is a cool cat. You should name her Mittens!");
        user2.follow(user1);

        Comment user3comment = user3.addComment(post, "What a stupid looking cat. You need to return it to the shelter ASAP >:(");
        user3.follow(user1);

        System.out.println(">>> Initial post");
        user1.display();

        System.out.println(">>> Inappropriate comment suspended");
        mod1.suspendComment(user3comment);
        user1.display();

        System.out.println(">>> Inappropriate user suspended");
        mod1.suspendUser(user3);
        user1.display();
    }
}
