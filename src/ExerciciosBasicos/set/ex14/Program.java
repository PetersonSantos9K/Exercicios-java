package ExerciciosBasicos.set.ex14;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    void main(){

        Set<Integer> numbers = new TreeSet<>(Arrays.asList(2,5,7,8));

        Set<Integer> missingNumbers = new TreeSet<>();

        Integer value = null;
        for(Integer number : numbers){
            if(value!=null){

                while(value + 1< number){
                    value++;
                    missingNumbers.add(value);
                }
            }
            value = number;
        }

        for(Integer number : missingNumbers){
            IO.println(number);
        }


    }

}
