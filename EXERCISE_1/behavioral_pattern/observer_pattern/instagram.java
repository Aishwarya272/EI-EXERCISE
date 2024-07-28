import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String post);
}

// Subject Interface
interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class InstagramAccount implements Subject {
    private List<Observer> followers = new ArrayList<>();
    private String latestPost;

    public void addPost(String post) {
        this.latestPost = post;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer follower : followers) {
            follower.update(latestPost);
        }
    }
}

// Concrete Observer
class Follower implements Observer {
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(String post) {
        System.out.println(name + " received notification: " + post);
    }
}
