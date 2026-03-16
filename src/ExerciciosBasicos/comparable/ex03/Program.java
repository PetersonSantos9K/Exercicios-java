package ExerciciosBasicos.comparable.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        players.add(new Player("Ana", 150));
        players.add(new Player("Carlos", 300));
        players.add(new Player("Pedro", 200));

        Collections.sort(players);

        for(Player player : players){
            System.out.println(player);
        }


    }
}
