package ExerciciosBasicos;

import java.util.Scanner;

public class Ex03 {


    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Qual sua média? ");
        double mediaFinal = sc.nextDouble();
        if (mediaFinal < 7 && mediaFinal >= 0) {
            IO.println("Sua media foi: " + mediaFinal + ", voçe precisa estudar mais.");
        } else if(mediaFinal == 7){
            IO.println("Sua media foi: " + mediaFinal + ", voçe foi aprovado.");
        } else if( mediaFinal > 7 && mediaFinal < 9){
            IO.println("Sua media foi: " + mediaFinal + ", parabens, suas notas ficaram acima da média.");
        } else if( mediaFinal >= 9 && mediaFinal <= 10){
            IO.println("Parabens, voçe é um excelente aluno.");
        } else {
            IO.println("Valor incorreto, envie novamente com a media dentro do permitido.");
        }
    }
}
