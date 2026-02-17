package ExerciciosBasicos;

import java.util.Scanner;

public class Ex18 {


    static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[3][2];

        System.out.println("Sistema de notas");

        System.out.println("Digite a primeira nota: ");
        int primeiraNota = sc.nextInt();
        System.out.println("Digite o peso da primeira nota: ");
        int pesoPrimeiraNota = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int segundaNota = sc.nextInt();
        System.out.println("Digite o peso da segundo nota: ");
        int pesoSegundoNota = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        int terceiraNota = sc.nextInt();
        System.out.println("Digite o peso da terceira nota: ");
        int pesoTerceiraNota = sc.nextInt();

        notas[0][0] = primeiraNota;
        notas[0][1] = pesoPrimeiraNota;

        notas[1][0] = segundaNota;
        notas[1][1] = pesoSegundoNota;

        notas[2][0] = terceiraNota;
        notas[2][1] = pesoTerceiraNota;

        int somaMedia = 0;
        int somaPeso = 0;
        for(int i=0; i<notas.length; i++){
            somaMedia += notas[i][0] * notas[i][1];
            somaPeso += notas[i][1];
        }

        IO.println(somaMedia/somaPeso);


        sc.close();
    }
}
