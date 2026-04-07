package E.Ex43;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex06 {


    void main(){

        Set<Integer> setA = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3,4,5));
        setA.addAll(setB);

        for(Integer set : setA){
            IO.println(set);
        }

    }


}
