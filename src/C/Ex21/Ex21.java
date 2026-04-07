package C.Ex21;

import java.util.List;

public class Ex21 {

    static void main(String[] args) {

        System.out.println("Primeiro exercicio de generic para resolver algumas lacunas em meus conhecimentos.");

        List<String> list = List.of("Peterson");


        System.out.println(getFirstElementType(list));

    }

    public static <ElementType > ElementType getFirstElementType(List<ElementType> list){
        return list.getFirst();
    }

}
