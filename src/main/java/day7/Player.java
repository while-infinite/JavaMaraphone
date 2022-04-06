package day7;

public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        countPlayers++;
        if (countPlayers > 6) {
            countPlayers--;
        } else this.stamina = stamina;

    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA)
            countPlayers--;
        if (stamina < 0)
            stamina = 0;

    }

    public static void info() {
        if (countPlayers == 5)
            System.out.println("Команды неполные. На поле есть ещё одно свободное место");
        else {
            if (countPlayers < 6)
                System.out.println("Команды неполные. На поле есть ещё " + countPlayers + " свободных мест");
            else
                System.out.println("На поле нет свободных мест");
        }
    }
}
