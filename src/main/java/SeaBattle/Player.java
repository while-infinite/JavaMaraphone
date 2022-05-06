package SeaBattle;

import java.util.Arrays;

public class Player {
    private String[][] playground = new String[10][10];

    public Player() {
        for (int i = 0; i <playground.length; i++)
            Arrays.fill(playground[i], " 🟨 ");
    }

    public void setPlayground(String[][] playground) {
        this.playground = playground;
    }

    public String[][] getPlayground() {
        return playground;
    }
}
