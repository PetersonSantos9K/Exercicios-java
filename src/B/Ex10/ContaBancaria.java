package B.Ex10;

public class ContaBancaria {

    private final Integer numeroConta;
    private Double saldo = 0.0;
    private final String nomeTitular;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Integer getNumeroConta(){
        return this.numeroConta;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){

        if(valor <= 0 || valor > this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public Double consultarSaldo(){
        return this.saldo;
    }
}
