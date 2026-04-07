package D.Ex36;

import java.util.HashMap;
import java.util.Map;

public class Program {

    void main(){

        Map<String, Integer> ranking = new HashMap<>();

        ranking.put("Ana", 10);
        ranking.put("Carlos", 20);
        ranking.put("Maria", 15);

        int count = 0;
        for(String name : ranking.keySet()){
            count += ranking.get(name);
        }

        IO.println("Value Total: " + count);

    }
}
