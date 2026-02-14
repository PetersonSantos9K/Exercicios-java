package ExerciciosSimples;

import java.util.Scanner;

public class Ex02 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Sálario base: ");
        double salario = sc.nextInt();
        sc.close();

        double salarioAReceber = (salario - (salario*0.7 / 10)) + (salario*0.5 / 10);
        IO.println(salarioAReceber);
    }
}
