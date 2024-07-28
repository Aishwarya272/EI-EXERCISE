// Client.java
public class client {
    public static void main(String[] args) {
        InstagramAccount account = new InstagramAccount();

        Follower follower1 = new Follower("Alice");
        Follower follower2 = new Follower("Bob");
        Follower follower3 = new Follower("Charlie");

        account.attach(follower1);
        account.attach(follower2);
        account.attach(follower3);

        account.addPost("Added a new post");
        
    }
}
