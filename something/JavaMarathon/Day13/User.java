package zz.something.JavaMarathon.Day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    } //try??

    public boolean isFriend(User user) {
        List<Message> list = new ArrayList<>(MessageDatabase.getMessages());
        int count = 0;
        for (Message message : list) {
            if (message.getReceiver().equals(user)) count++;
        }
        return count >= 3;
    // что такое дружба в контексте соц сетей - кол-во сообщений?
    }

    public void sendMessage(User user, String text) {
        // tut static database
      MessageDatabase.sendMessage(this, user, text); //как-то обратиться к юзеру
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return "User " + username;
    }

}
