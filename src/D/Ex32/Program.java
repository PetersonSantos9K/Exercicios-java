package D.Ex32;

import java.util.HashMap;
import java.util.Map;

public class Program {


    void main(){

        Map<String, Integer> alunos = new HashMap<>();
        alunos.put("Ana", 20);
        alunos.put("Carlos", 22);
        alunos.put("Maria", 19);
        IO.println(alunos.get("Maria"));

        alunos.forEach((key, element) ->  IO.println(element));

    }


}
