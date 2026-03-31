package ExerciciosBasicos.generic;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

    static void main(String[] args) {

        List<String> names = new ArrayList<>();

        for(int i=0; i<=5;i++){
            names.add("name " + i );
        }



        System.out.println("Função antes dos valores trocados.");
        for(String name : names) {
            System.out.println(name);
        };

        int indexOne = 2;
        int indexTwo = 4;
        System.out.println("index escolhido para trocar as posição: " + indexOne + " e " + indexTwo );
        System.out.println("Função com os valores trocados.");

        swap(names, 0, 1);

        for(String name : names) System.out.println(name);

    }


    private static <TypeListElement> void swap(List<TypeListElement> elementList, int indexOne, int indexTwo){
        TypeListElement elementOne = elementList.get(indexOne);
        elementList.set(indexOne, elementList.get(indexTwo));
        elementList.set(indexTwo, elementOne);
    }

}
