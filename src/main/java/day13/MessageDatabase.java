package day13;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1,u2,text));

    }

    public static List<Message> getMessages() {
        return messages;
    }
    public static void showDialog(User u1, User u2){
        for (int i = 0; i < messages.size(); i++) {
            if(messages.get(i).getSender().equals(u1) && messages.get(i).getReceiver().equals(u2) )               //сравниваем  пользователей
                System.out.println(u1.getUsername() + ": " + messages.get(i).getText());
            if(messages.get(i).getSender().equals(u2) && messages.get(i).getReceiver().equals(u1) )               //сравниваем пользователей
                System.out.println(u2.getUsername() + ": " + messages.get(i).getText());
        }
    }
}
