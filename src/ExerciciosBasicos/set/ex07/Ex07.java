package ExerciciosBasicos.set.ex07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex07 {

    void main(){

        Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3,4));
        setA.removeAll(setB);
        IO.println(setA);
    }
}
