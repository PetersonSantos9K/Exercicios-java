package ExerciciosPOO.Nivel_Facil.Ex05;

import ExerciciosPOO.Nivel_Facil.Ex05.Enum.ContaEnum;
import ExerciciosPOO.Nivel_Facil.Ex05.Model.Conta;
import ExerciciosPOO.Nivel_Facil.Ex05.Model.ContaCorrente;
import ExerciciosPOO.Nivel_Facil.Ex05.Model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<Conta>();

        adicionarContas(sc, contas);

        for(Conta conta : contas){
            System.out.println(conta.toString());
        }

        boolean addConta = true;
        do {
            addConta = acessarConta(sc, contas);

            System.out.println("Deseja acessar outra conta? 1-SIM | 2-NAO");
            int escolhaConta = sc.nextInt();
            if(escolhaConta == 1){
                addConta = true;
            }
        }while (addConta);


    }


    private static void adicionarContas(Scanner sc, ArrayList<Conta> contas){
        System.out.println("Quantas contas deseja adicionar? ");
        int n = sc.nextInt();


        for(int i=0; i<n; i++){

            System.out.printf("Conta %s\n", i+1);

            System.out.println("Selecione o tipo de conta: 1-Corrente | 2-Poupança");
            int escolhaConta = sc.nextInt();

            int numeroConta;
            String nomeConta;

            switch (escolhaConta){

                case 1:

                    System.out.println("Numero da conta: ");
                    numeroConta = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Nome do cliente: ");
                    nomeConta = sc.nextLine();


                    System.out.println("A conta vai utilizar cheques: 1-sim 2-não ");
                    int utilizaCheque = sc.nextInt();

                    boolean utilizaChequeConta = utilizaCheque == 1;
                    contas.add(new ContaCorrente(numeroConta, nomeConta, utilizaChequeConta));
                    System.out.println("Conta Adicionada.");
                    break;
                case 2:

                    System.out.println("Numero da conta: ");
                    numeroConta = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Nome do cliente: ");
                    nomeConta = sc.nextLine();


                    double rendimentoConta = 20.0;

                    System.out.println("Atualmente a conta terá um rendimento de " + String.format("%.2f",rendimentoConta) + "%");
                    contas.add(new ContaPoupanca(numeroConta, nomeConta, rendimentoConta));
                    System.out.println("Conta Adicionada.");
                    break;

                default:
                    System.out.println("Tente Novamente (Valor Incorreto). ");
                    i--;
                    continue;
            }


        }

    }

    private static boolean acessarConta(Scanner sc, ArrayList<Conta> contas){

        System.out.println("Digite o numero da conta que deseja acessar: ");
        int numeroConta = sc.nextInt();

        Conta contaAcessada = null ;
        boolean verificarConta = false;
        for(int i=0; i<contas.size(); i++){

            if(contas.get(i).getNumeroConta() == numeroConta){
                contaAcessada = contas.get(i);
                verificarConta = true;
                break;
            }
        }

        if(!verificarConta){
            System.out.println("Tente novamente (numero invalido).");
            return true;
        }

        // conta acessada, numero correto.
        System.out.println("Conta acessada com sucesso.");
        System.out.println(contaAcessada.toString());

        System.out.println("Saldo atual: " + contaAcessada.saldoAtual());

        System.out.println("Deseja realizar alguma movimentação financeira ? SIM | NAO");
        String realizarMovimentacao = sc.next();


        while(realizarMovimentacao.equals("SIM")){

            if(contaAcessada.saldoAtual() <= 0 ){
                System.out.println("Realize seu primeiro deposito.");
                System.out.println("Valor: ");
                double primeiroDeposito = sc.nextDouble();
                boolean d = contaAcessada.depositar(primeiroDeposito);
                System.out.println(d?"Deposito realizado com sucesso":"Tente novamente (valor invalido).");
                continue;
            }

            System.out.println("Saldo atual: " + contaAcessada.saldoAtual());
            System.out.println("1- Deposito | 2- Saque");
            int depositoOuSaque = sc.nextInt();

            switch (depositoOuSaque){
                case 1:
                    System.out.println("Digite o valor que deseja depositar:  ");
                    double valorDeposito = sc.nextDouble();
                    boolean d = contaAcessada.depositar(valorDeposito);
                    System.out.println(d?"Deposito realizado com sucesso": "Tente novamente (valor invalido).");
                    System.out.println("Saldo atual: " + contaAcessada.saldoAtual());
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = sc.nextDouble();
                    boolean s = contaAcessada.sacar(valorSaque);
                    System.out.println(s?"Saque realizado com sucesso" : "Tente novamente (valor invalido).");
                    System.out.println("Saldo atual: " + contaAcessada.saldoAtual());
                    break;
                default:
                    System.out.println("Tente novamente (valor invalido).");
                    continue;
            }


            System.out.println("Deseja continuar? SIM | NAO");
            realizarMovimentacao = sc.next();
        }

        System.out.println("Sistema Finalizando...");
        verificarConta = false;
        return false;
    }
}
