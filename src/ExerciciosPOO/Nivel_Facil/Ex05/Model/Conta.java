package ExerciciosPOO.Nivel_Facil.Ex05.Model;

import ExerciciosPOO.Nivel_Facil.Ex05.Enum.ContaEnum;

public class Conta {

    private Integer numeroConta;
    private String nomeCliente;
    private Double saldoAtual = 0.0;
    private ContaEnum tipoDaConta;


    public Conta(int numeroConta, String nomeCliente, ContaEnum tipoDaConta){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.tipoDaConta = tipoDaConta;
    }

    public Conta(){}

    public Integer getNumeroConta(){
        return this.numeroConta;
    }

    public String  getNomeCliente(){
        return this.nomeCliente;
    }

    public ContaEnum getTipoDaConta(){
        return this.tipoDaConta;
    }

    private void setSaldoAtual(double valor){
        saldoAtual = valor;
    }

    private Double getSaldoAtual(){
        return this.saldoAtual;
    }


    public boolean depositar(double valor){

        if(valor <= 0){
            return false;
        }
        setSaldoAtual(getSaldoAtual() + valor);
        return true;
    }

    public boolean sacar(double valor){

        if(valor <= 0 && valor > getSaldoAtual()){
            return false;
        }
        setSaldoAtual(getSaldoAtual() - valor);
        return true;
    }

    public double saldoAtual(){
        return getSaldoAtual();
    }

    @Override
    public String toString(){
        return String.format("\nTipo da conta: %s\nNome do cliente: %s\nNumero da conta: %d\n", getTipoDaConta().name(), getNomeCliente(), getNumeroConta());
    }
}
