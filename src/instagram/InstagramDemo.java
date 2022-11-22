package instagram;

import java.util.Scanner;

/**
 * Main program.
 */
public class InstagramDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Different users and their usernames
        Moderator mod1 = new Moderator();
        User user1 = new User("_catlover445_");

        User user2 = new User("alex.g.");

        User user3 = new User("4n1m4l_h4t3rz");

        // Introduction
        System.out.println("This program simulates a few Instagram use cases, press Enter to continue.");
        scanner.nextLine();

        // Post created
        Post post = user1.createPost("I got a new cat guys ^_^", "Soooo cutee! What should I name her??");

        user1.displayProfile();
        System.out.println("Above is a new post by user " + user1.getUsername() + ", press Enter to see some likes and comments by other users.");
        scanner.nextLine();

        // Comments and follows
        user2.likePost(post);
        user2.addComment(post, "That is a cool cat. You should name her Mittens!");
        user2.follow(user1);

        Comment user3comment = user3.addComment(post, "What a stupid looking cat. You need to return it to the shelter ASAP >:(");
        user3.follow(user1);

        user1.displayProfile();
        System.out.println("The post has received likes and comments and the user has got followers, press Enter to see the user follow other users.");
        scanner.nextLine();        

        // User has gained followers
        user1.follow(user2);
        user1.displayProfile();

        System.out.println(user1.getUsername() + " is now following " + user2.getUsername() + ", press Enter to see the mod suspend an inappropriate commment.");
        scanner.nextLine(); 

        // Moderator suspends a commnent; it is no longer visible
        mod1.suspendComment(user3comment);
        user1.displayProfile();

        System.out.println("The inappropriate comment is no longer visible, press Enter to see the mod suspend " + user3.getUsername() + " as well.");
        scanner.nextLine();
        
        // Moderator suspends a user; user is no longer shown in followers
        mod1.suspendUser(user3);
        user1.displayProfile();

        System.out.println("The inappropriate user " + user3.getUsername() + " is suspended and the follow is no longer visible, press Enter to see another post created by " + user1.getUsername() + ".");
        scanner.nextLine();

        Post post2 = user1.createPost("Computer science is the future!", "Thank you for teaching us Mr. Fabroa!");
        user2.likePost(post2);
        user2.addComment(post2, "I can't agree more!!!");
        user1.displayProfile();

        scanner.close();
    }
}
