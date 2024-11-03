package zz.something.JavaMarathon.Day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MessageDatabase {

    private static List<Message> messagesDatabase = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messagesDatabase.add(message);
    }

    public static List<Message> getMessages() {
        return messagesDatabase;
    }

    public static void showDialog(User u1, User u2) {
        //stream?
//        List<Message> list = new ArrayList<>(MessageDatabase.getMessages());
        List<Message> list = MessageDatabase.getMessages().stream()
                .filter(m -> (m.getReceiver()).equals(u1) && (m.getSender().equals(u2))
                        || (m.getReceiver().equals(u2)) && (m.getSender().equals(u1)))
                .sorted(Comparator.comparing(Message::getDate)).toList(); //date is okey without time??
//        System.out.println(list);
        for (Message m : list) {
            System.out.println(m.getSender().getUsername() + ": " + m.getText());
        }
    }
}
