package ExerciciosBasicos.set.ex05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex05 {


    void main (){

        Set<Integer> numbersA = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> numbersB = new HashSet<>(Arrays.asList(3,4,5,6));




        IO.println("Numbers A");
        for(Integer numberA : numbersA) {
            IO.println(numberA);
        }

        IO.println("Numbers B");
        for(Integer numberB : numbersB){
            IO.println(numberB);
        }
        numbersA.retainAll(numbersB);
        IO.println("Common number: ");
        for(Integer commonNumber : numbersA){
            IO.println(commonNumber);
        }

    }


}
