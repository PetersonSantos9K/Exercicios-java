package ExerciciosBasicos.set.ex02;


import java.util.*;

public class Ex02 {

    void main(){
        // Remove duplicate items from the list.
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,2,1,3,6,5,6,5));

        Set<Integer> newList = new HashSet<>(list);

        for(Integer number : newList){
            IO.println(number);
        }
    }
}
