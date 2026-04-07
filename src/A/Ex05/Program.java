package A.Ex05;

import A.Ex05.model.Conta;
import A.Ex05.model.ContaPoupanca;
import A.Ex05.model.ContaCorrente;

import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Conta conta = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tipo de conta deseja criar? (1 - Conta Corrente / 2 - Conta Poupança)");
        int tipoConta = sc.nextInt();

        if(tipoConta < 1 || tipoConta > 2) {
            System.out.println("Tipo de conta inválida...");
            return;
        }

        System.out.println("Digite o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.next();

        switch (tipoConta) {
            case 1:

                System.out.println("Utiliza cheque especial? (1 - true / 2 - false)");
                int utilizaChequeEspecial = sc.nextInt();

                if(utilizaChequeEspecial < 1 || utilizaChequeEspecial > 2) {
                    System.out.println("Valor inválido para utilização do cheque especial...");
                    return;
                }

                conta = new ContaCorrente(numeroConta, nomeCliente, utilizaChequeEspecial == 1);

                break;

            case 2:
                System.out.println("Digite a taxa de rendimento:");
                double taxaRendimento = sc.nextDouble();

                if(taxaRendimento <= 0) {
                    System.out.println("Valor inválido para taxa de rendimento...");
                    return;
                }

                conta = new ContaPoupanca(numeroConta, nomeCliente, taxaRendimento/100);
                break;
            default:
                System.out.println("Tipo de conta inválida...");
        }


        System.out.println(conta);

        System.out.println("Deseja realizar o primeiro deposito: (1 - sim / 2 - não)");
        int respostaDeposito = sc.nextInt();

        if(respostaDeposito != 1) {
            System.out.println("Operação de depósito cancelada...");
            System.out.println("Finalizando programa...");
            return;
        }

        System.out.println("Digite o valor do depósito:");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        System.out.println("Saldo atual: " + conta.getSaldoAtual());

        System.out.println("Deseja realizar o primeiro saque: (1 - sim / 2 - não)");
        int respostaSaque = sc.nextInt();

        if(respostaSaque != 1) {
            System.out.println("Operação de saque cancelada...");
            System.out.println("Finalizando programa...");
            return;
        }

        System.out.println("Digite o valor do saque:");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("Saldo atual: " + conta.getSaldoAtual());

         if(conta instanceof ContaPoupanca contaPoupanca) {
             contaPoupanca.aplicarRendimento();
             System.out.println("Rendimento aplicado! Saldo atual: " + contaPoupanca.getSaldoAtual());
         }

         if(conta instanceof ContaCorrente contaCorrente){

             System.out.println("Utiliza cheque especial: " + contaCorrente.isUtilizaChequeEspecial());
         }

        System.out.println(conta);

        System.out.println("Finalizando programa...");

    }
}
