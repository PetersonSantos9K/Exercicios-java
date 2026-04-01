package ExerciciosBasicos.set.ex04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex04 {

    void main(){

        String phreases = "java é legal e java é poderoso";

        Set<String> phrasesUnique = new HashSet<>(Arrays.stream(phreases.split(" ")).toList());


        IO.println(phrasesUnique.size() + " unique words");
    }



}
