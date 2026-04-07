package B.Ex18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player("Player_A", 1500, 10));
        playerList.add(new Player("Player_B", 1500, 12));
        playerList.add(new Player("Player_C", 1200, 15));
        playerList.add(new Player("Player_D", 1500, 12));

        Collections.sort(playerList);

        for(Player player : playerList){
            System.out.println(player);
        }


    }
}
