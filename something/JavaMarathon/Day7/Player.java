package zz.something.JavaMarathon.Day7;

public class Player {

    static final int MIN_STAMINA = 0; // private же не нужен, раз и так final?
    static final int MAX_STAMINA = 100;
    private int stamina;
    static int countPlayers = 0;
    private String name;

    public Player(String name) {
        this.name = name;
        this.stamina = ((int) (90 + 10 * Math.random()));
        if (countPlayers < 6) {
            countPlayers++;
        } else {
            countPlayers = 6;
        }
    }

    public void run() {
        if (stamina > 0) stamina--;
        if (stamina == 0) {
            System.out.println("Игрок " + name + " выдохся");
            countPlayers--;
        }
        if (stamina < 0) System.out.println("выгорание??");

    }

    public static void info() {
        switch (countPlayers) {
            case 1 -> System.out.println("На поле  " + countPlayers + " игрок");
            case 2,3,4 -> System.out.println("На поле  " + countPlayers + " игрока");
            case 5, 6 -> System.out.println("На поле  " + countPlayers + " игроков");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "stamina=" + getStamina() +
                ", name='" + name + '\'' +
                '}';
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
