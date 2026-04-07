package D.Ex35;

import java.util.HashMap;
import java.util.Map;

public class Program {

    void main(){

        Map<String, Integer> ranking = new HashMap<>();

        ranking.put("João", 5);
        ranking.put("Pedro", 8);
        ranking.put("Lucas", 3);

        for(String name : ranking.keySet()){
            IO.println(String.format("%s tem %d pontos", name, ranking.get(name)));
        }



    }


}
