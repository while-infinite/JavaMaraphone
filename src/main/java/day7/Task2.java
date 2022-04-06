package day7;

import java.awt.event.WindowFocusListener;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player[] players = new Player[6];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(random.nextInt((101 - 90)) + 91);
        }

        for (int i = players[0].getStamina(); i >= 0; i++) {
            players[0].run();
        }
        Player.info();
        System.out.println(players[0].getStamina());


    }
}
