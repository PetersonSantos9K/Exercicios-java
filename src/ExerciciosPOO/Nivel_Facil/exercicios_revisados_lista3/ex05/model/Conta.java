package ExerciciosPOO.Nivel_Facil.exercicios_revisados_lista3.ex05.model;

public class Conta {

    private Integer numeroConta;
    private String nomeCliente;
    private Double saldoAtual = 0.0;

    public Conta(){}

    public Conta(Integer numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    private void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void depositar(final double valor) {

        if(valor <= 0) {
            System.out.println("Valor inválido para depósito...");
            return;
        }
        setSaldoAtual(getSaldoAtual() + valor);
    }

    public void sacar(final double valor) {

        if(valor <= 0) {
            System.out.println("Valor inválido para saque...");
            return;
        }

        if(valor > this.saldoAtual) {
            System.out.println("Saldo insuficiente para saque...");
            return;
        }
        setSaldoAtual(getSaldoAtual() - valor);
    }

    @Override
    public String toString() {
        return String.format("Número da conta: %d\nNome do cliente: %s\nSaldo atual: R$ %.2f", numeroConta, nomeCliente, saldoAtual);
    }
}
