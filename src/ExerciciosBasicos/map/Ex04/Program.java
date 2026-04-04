package ExerciciosBasicos.map.Ex04;

import java.util.HashMap;
import java.util.Map;

public class Program {

    void main(){
        Map<String, String> paises = new HashMap<>();
        paises.put("BR", "Brasil");
        paises.put("US", "Estados Unidos");
        paises.put("FR", "França");

        paises.remove("US");

        paises.forEach((k, v) -> IO.println(v));
    }

}
