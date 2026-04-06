package ExerciciosBasicos.logica;

import java.util.Set;
import java.util.TreeSet;

public class Ex29 {


    void main(){
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);

        Set<Integer> missingNumbers = new TreeSet<Integer>();
        Integer previous = null;
        for(Integer number : numbers){

            if(previous != null){
                while (previous + 1 < number){
                    missingNumbers.add(previous+1);
                    previous++;
                }
            }

            previous = number;

        }

        for(int number : missingNumbers){
            IO.println(number);
        }
    }


}
