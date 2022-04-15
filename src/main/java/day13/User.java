package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription;

    public User(String username){
        this.username = username;
        subscription = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscription;
    }

    public void subscribe(User user){
        this.subscription.add(user);
    }

    public boolean isSubscribed(User user){
        return this.subscription.contains(user);
    }

    public boolean isFriend(User user){
        return user.isSubscribed(this);
    }
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
