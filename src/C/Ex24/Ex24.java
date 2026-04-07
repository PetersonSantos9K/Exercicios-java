package C.Ex24;

import java.util.List;

public class Ex24 {

    static void main(String[] args) {


        List<Number> list = List.of(10, 1, 2, 2.1, 4.4);

        Double valueSoma = sumNumbers(list);
        System.out.println(valueSoma);

    }

    private static double sumNumbers(List<? extends Number> listNumbers){

        double soma = 0.0;

        for(Number n : listNumbers){
            soma += n.doubleValue();
        }
        return soma;
    }

}
