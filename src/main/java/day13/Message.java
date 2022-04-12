package day13;

import java.util.Date;
import java.util.SplittableRandom;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public User getSender() {
        return sender;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  "FROM: " + sender + '\n' +
                "TO: " + receiver + '\n' +
                "ON: " + date + '\n' +
                 text;
    }
}
