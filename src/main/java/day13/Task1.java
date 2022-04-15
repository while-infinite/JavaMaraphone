package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Андрей");
        User user2 = new User("Саша");
        User user3 = new User("Маша");

        user1.subscribe(user3);
        for (User list : user1.getSubscriptions()) {
            System.out.println(list);
        }

        user1.sendMessage(user2, "Привет, Саша!");
        user1.sendMessage(user2, "Как прошли твои экзамены?");
        user2.sendMessage(user1, "Привет, Андрей!");
        user2.sendMessage(user1, "Сдал всё, кроме начерталки(");
        user2.sendMessage(user1, "Нужно будет завтра с другой группой пересдавать");
        user3.sendMessage(user1,"Саш, привет, у тебя остались ответы по философии?");
        user3.sendMessage(user1,"У кого не спрошу все отмазываються");
        user3.sendMessage(user1,"Тут 2 дня осталось, уже не знаю что делать!");
        user1.sendMessage(user3,"Привет, Маш! есть");
        user1.sendMessage(user3,"Только я сегодня до 6 работаю, раньше не смогу прислать");
        user1.sendMessage(user3,"Хотя. погоди! если дома кто то из своих есть я попрошу, что бы тебе передали");
        user3.sendMessage(user1,"Спасибой большое! Очень выручишь!");

        MessageDatabase.showDialog(user3,user1);
    }
}
