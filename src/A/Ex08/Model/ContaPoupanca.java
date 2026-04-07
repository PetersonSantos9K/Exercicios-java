package A.Ex08.Model;

import A.Ex08.Enum.ContaEnum;

public class ContaPoupanca extends Conta {

    private final Double porcentagemRendimento;

    public ContaPoupanca(int numeroConta, String nomeConta, double porcentagemRendimento){
        super(numeroConta, nomeConta, ContaEnum.POUPANCA);
        this.porcentagemRendimento = porcentagemRendimento;

        aplicarRendimento();
    }

    public double getPorcentagemRendimento(){
        return this.porcentagemRendimento;
    }

    private void aplicarRendimento(){
        if(saldoAtual() > 0){
            double valorRedimento = saldoAtual() * porcentagemRendimento / 100;
            depositar(valorRedimento);
        }
    }
}
