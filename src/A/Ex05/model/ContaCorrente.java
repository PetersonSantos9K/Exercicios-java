package A.Ex05.model;

public class ContaCorrente extends Conta{

    private boolean utilizaChequeEspecial;

    public ContaCorrente(final int numeroConta, final String nomeCliente, final boolean utilizaChequeEspecial) {
        super(numeroConta, nomeCliente);
        this.utilizaChequeEspecial = utilizaChequeEspecial;
    }

    public Boolean isUtilizaChequeEspecial() {
        return utilizaChequeEspecial;
    }


    @Override
    public String toString() {
        return String.format("Número da conta: %d\nNome do cliente: %s\nSaldo atual: R$ %.2f\nUtiliza cheque: %b\n", getNumeroConta(), getNomeCliente(), getSaldoAtual(), isUtilizaChequeEspecial());
    }
}
