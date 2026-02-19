package ExerciciosPOO.Nivel_Facil.Ex05.Model;

import ExerciciosPOO.Nivel_Facil.Ex05.Enum.ContaEnum;

public class ContaCorrente extends Conta{

    private final Boolean contaCheque;

    public ContaCorrente(int numeroConta, String nomeCliente, boolean contaCheque){
        super(numeroConta, nomeCliente, ContaEnum.CORRENTE);
        this.contaCheque = contaCheque;
    }

    public boolean getContaCheque(){
        return this.contaCheque;
    }

}
