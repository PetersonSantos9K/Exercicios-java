package ExerciciosPOO.Nivel_Facil.Ex01;

import java.util.Random;
import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Bem vindo a sua conta Bancaria!");

        IO.print("Escreva seu nome: ");
        String nome = sc.nextLine();
        IO.println();
        int numeroContaBancaria = (int) (Math.random() * 100);
        ContaBancaria conta = new ContaBancaria(numeroContaBancaria, nome);

        IO.println("Olá " + conta.getNomeTitular() + ", Seja bem vindo!");

        if(conta.consultarSaldo() == 0){
            IO.println("Realize seu primeiro deposito.");
            IO.print("Valor: ");
            double deposito = sc.nextDouble();
            boolean depositoVerificValue = conta.depositar(deposito);
            IO.println(depositoVerificValue?"Deposito realizado com sucesso!" : "Valor incorreto!");
        }

        IO.println("Deseja entra no sistema de saque e deposito? 1-Sim 2-Nao");
        int sistemaSaqueDeposito = sc.nextInt();

        while (sistemaSaqueDeposito== 1){

            IO.println("1-Deposito 2-Saque");
            int escolha = sc.nextInt();
            double deposito = 0.0;
            double saque = 0.0;
            switch (escolha){

                    case 1:
                        IO.print("Valor para deposito: ");
                        deposito = sc.nextDouble();
                        if(conta.depositar(deposito)){
                            IO.println("Deposito realizado com sucesso!");
                        } else {
                            IO.println("Valor invalido!");
                        }
                        break;
                    case 2:
                        IO.print("valor para saque: ");
                        saque = sc.nextDouble();
                        if(conta.sacar(saque)){
                            IO.println("Saque realizado com sucesso!");
                        } else {
                            IO.println("Saldo insuficiente!");
                        }
                        break;
                    default:
                        IO.println("Erro: digite entre 1 e 2 apenas.");
                        break;
                }



            IO.println("Valor atual: " + conta.consultarSaldo());

            IO.println("Deseja continuar? 1-Sim 2-Nao");
            sistemaSaqueDeposito = sc.nextInt();
        }
        sc.close();
        IO.println("Sistema Encerrado!");

    }
}
