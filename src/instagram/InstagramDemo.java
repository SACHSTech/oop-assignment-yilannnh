package instagram;

public class InstagramDemo {
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

        System.out.println(">>> User1 follows user2 as well, reload page");
        user1.follow(user2);
        user1.display();

        System.out.println(">>> Inappropriate comment suspended, reload page");
        mod1.suspendComment(user3comment);
        user1.display();

        System.out.println(">>> Inappropriate user suspended, reload page");
        mod1.suspendUser(user3);
        user1.display();

        System.out.println(">>> User posted again, reload page");
        Post post2 = user1.createPost("Computer science is the future!", "Thank you for teaching us Mr. Fabroa!");
        user2.likePost(post2);
        user1.display();
    }
}
