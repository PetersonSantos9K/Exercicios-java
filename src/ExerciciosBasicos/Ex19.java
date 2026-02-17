package ExerciciosBasicos;

import java.util.Scanner;

public class Ex19 {


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] notas = new float[3];
        float[] pesos = new float[3];

        float somaNotasPonderadas = 0;
        float somaPesos =0;

        for(int i=0; i<notas.length; i++){

            System.out.println("Digite a nota: " + (i+1) );
            notas[i] = sc.nextFloat();

            System.out.println("Digite o peso da nota: " + (i+1));
            pesos[i] = sc.nextFloat();

            somaNotasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        float mediaPonderada = somaNotasPonderadas / somaPesos;
        System.out.println("Média ponderada: " + mediaPonderada);

    }
}
