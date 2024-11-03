package zz.something.JavaMarathon.Day7;

import java.util.Arrays;

public class Day7_2 {
    public static void main(String[] args) {

        String[] names = new String[]{"Boris", "Pako", "Teoden", "Twittie",
                "Yoko", "Ronald", "Antonio", "UnknownPlayer"};

        Player[] players = new Player[names.length];
//         как создать несколько экземпляров через массив
        for (int i = 0; i < 8; i++) {
            players[i] = new Player(names[i]);
        }

        System.out.println(Arrays.toString(players));
        Player.info();

        while (players[3].getStamina() > Player.MIN_STAMINA) players[3].run();
        Player.info();

        while (players[1].getStamina() > Player.MIN_STAMINA) players[1].run();
        Player.info();

//            Optional.of("player")
//                    .map(Player::new)
//                    .map(Player::toString);
//        }

    }
}
