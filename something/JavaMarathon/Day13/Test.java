package zz.something.JavaMarathon.Day13;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Max");
        User user2 = new User("Twix");
        User user3 = new User("Snickers");

        MessageDatabase.sendMessage(user1, user2, "hi");
        MessageDatabase.sendMessage(user1, user2, "hihi");

        MessageDatabase.sendMessage(user2, user1, "yo");
        MessageDatabase.sendMessage(user2, user1, "yoyo");
        MessageDatabase.sendMessage(user2, user1, "yoyoyo");

        MessageDatabase.sendMessage(user3, user1, "za");
        MessageDatabase.sendMessage(user3, user1, "zaza");
        MessageDatabase.sendMessage(user3, user1, "zazaza");

        MessageDatabase.sendMessage(user1, user3, "dfs");
        MessageDatabase.sendMessage(user1, user3, "sdfsdg");
        MessageDatabase.sendMessage(user1, user3, "sfhdfhdfh");

        MessageDatabase.sendMessage(user3, user1, "zxzxzxzxzxzxzxzx");

        //System.out.println(MessageDatabase.getMessages());

        MessageDatabase.showDialog(user1, user3);

        System.out.println();
        System.out.println("u3 is friend for u1? - " + user1.isFriend(user3));
        user2.subscribe(user1);
        System.out.println("u2 sub for u1? - " + user2.isSubscribed(user1));

        System.out.println("\nproba send");
        user2.sendMessage(user3, "vot tak vot");
        MessageDatabase.showDialog(user2, user3);
    }
}
