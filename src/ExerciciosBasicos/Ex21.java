package ExerciciosBasicos;

import java.util.Scanner;

public class Ex21 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i =0; i< vetor.length; i++){
            System.out.println("Digite um número inteiro: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Os valores informados são: ");
        for (int i : vetor) {
            System.out.println(i);
        }

        System.out.println("Os valores informados em ordem inversa são: ");
        for(int i =vetor.length; i>0; i--){
            System.out.println(vetor[i-1]);
        }

        sc.close();
    }

}
