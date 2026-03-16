package ExerciciosPOO.Nivel_Facil.exercicios_revisados_lista3.ex03;

import ExerciciosPOO.Nivel_Facil.exercicios_revisados_lista3.ex03.model.Ingresso;
import ExerciciosPOO.Nivel_Facil.exercicios_revisados_lista3.ex03.model.IngressoVip;

import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Ingresso ingresso = null;
        IngressoVip ingressoVip = null;
        System.out.println("Cadastre o ingresso normal:");

        System.out.print("    Valor do ingresso: ");

        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        ingresso = new Ingresso(valor);

        System.out.println("Valor do ingresso normal: " + ingresso.getValor());
        System.out.println("Cadastre o adicional para o VIP:");
        System.out.print("    Valor do ingresso VIP: ");
        double valorVip = sc.nextDouble();
        ingressoVip = new IngressoVip(ingresso.getValor(), valorVip);
        System.out.println("Valor do ingresso VIP: " + ingressoVip.getValorAdicional());
        sc.close();
    }
}
