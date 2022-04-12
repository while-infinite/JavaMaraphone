package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription = new ArrayList<>();

    public User(String username){
        this.username = username;
        List<User> subscription = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscription;
    }
    public void subscribe(User user){
        subscription.add(user);
    }

    public boolean isSubscribed(User user){
        for (User value : subscription) {
            String s = value.getUsername();
            return s.equals(user.getUsername());
        }
        return false;
    }

    public boolean isFriend(User user){
        for (User value : user.getSubscriptions()) {
            String s = value.getUsername();
            return s.equals(this.username);
        }
        return false;
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
