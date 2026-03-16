package ExerciciosPOO.Nivel_Facil.exercicios_revisados_lista3.ex05.model;

public class ContaPoupanca extends Conta {

    private Double taxaRendimento;

    public ContaPoupanca(final int numeroConta, final String nomeCliente, final double taxaRendimento) {
        super(numeroConta, nomeCliente);
        this.taxaRendimento = taxaRendimento;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public Double calcularRendimento(){
        return getSaldoAtual() * taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = calcularRendimento();
        depositar(rendimento);
    }


    @Override
    public String toString() {
        return String.format("Número da conta: %d\nNome do cliente: %s\nSaldo atual: R$ %.2f\nTaxa de rendimento: %d%%\n", getNumeroConta(), getNomeCliente(), getSaldoAtual(), getTaxaRendimento() * 100);
    }
}
