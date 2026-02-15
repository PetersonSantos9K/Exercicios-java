package ExerciciosBasicos;

import java.util.Scanner;

public class Ex05 {

    static void main() {

        // ler dois numeros
        // user escolher uma das 4 operaçoes -> depois efetuar a operação

        Scanner sc = new Scanner(System.in);

        IO.println("Numero 1: ");
        int num1 = sc.nextInt();

        IO.println("Numero 2: ");
        int num2 = sc.nextInt();

        IO.println("1-Soma | 2-Subtracao | 3-Multiplicacao | 4-Divisao");
        int escolha = sc.nextInt();
        int resultado = 0;
        switch (escolha){
            case 1:
                resultado = num1 + num2;
                IO.println("SOMA: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                IO.println("SUBTRACAO: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                IO.println("MULTIPLICACAO: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                IO.println("DIVISAO: " + resultado);
                break;
            default:
                IO.println("Valor incorreto!");
                IO.println("A escolha deverá ser feita entre 1 e 4.");
                break;
        }
        sc.close();
    }
}
