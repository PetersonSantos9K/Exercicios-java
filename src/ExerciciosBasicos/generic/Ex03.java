package ExerciciosBasicos.generic;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    static void main(String[] args) {

        List<String> stringNames = new ArrayList<>();

        for(int i=1; i<=5;i++){
            stringNames.add("name "+i);
        }

        printAll(stringNames);


    }

    private static <typeList> void printAll(List<typeList> list){
        for(typeList element : list){
            System.out.println(element);
        }
    }
}
