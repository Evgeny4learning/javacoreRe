package zz.something.JavaMarathon.Day13;

import java.time.LocalDate;
import java.util.Date;

public class Message {

    private User sender;
    private User receiver;
    private String text;
    private LocalDate date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        String res = "\n" + "FROM: '" + sender + "'\n"
                + "TO: '" + receiver + "'\n"
                + "ON: " + date + "\n"
                + "'" + text + "'\n";
        return res;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }
}
