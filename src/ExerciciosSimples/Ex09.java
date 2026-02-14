package ExerciciosSimples;

import java.util.Scanner;

public class Ex09 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{

            IO.print("Numero: ");
            number = sc.nextInt();
            IO.println("Valor: " + number);


        } while (number >= 0);

        IO.println("Voçe escolheu um valor negativo, programa finalizado! ");
        sc.close();
    }

}
