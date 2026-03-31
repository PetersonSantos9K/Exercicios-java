package ExerciciosBasicos.logica;

import java.util.Scanner;

public class Ex27 {
    static void main(String[] args) {

        int[] vetorA = new int[]{1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele existe no vetor: ");
        int numero = sc.nextInt();

        int posicao = -1;

        for(int i=0; i<vetorA.length; i++){

            if(numero == vetorA[i]){
                posicao = i;
                break;
            }
        }

        if(posicao == -1){
            System.out.println("O número " + numero + " não existe no vetor.");
            return;
        }

        System.out.println("O número " + numero + " existe no vetor e está na posição: " + posicao);

        sc.close();
    }
}
