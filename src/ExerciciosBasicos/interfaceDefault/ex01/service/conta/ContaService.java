package ExerciciosBasicos.interfaceDefault.ex01.service.conta;

import ExerciciosBasicos.interfaceDefault.ex01.model.Conta;

import java.security.InvalidParameterException;

public class ContaService {


    public static void deposit(Conta conta, final double amount){

        if(amount < 1){
            throw new InvalidParameterException("É necessario informar um valor válido para o deposito.");
        }
        conta.setBalance(conta.getBalance() + amount);
    }

    public static Double sacar(Conta conta, final double amount){

        if(amount < 1){
            throw new InvalidParameterException("É necessario informar um valor válido para o saque.");
        }

        if(amount > conta.getBalance()){
            throw new InvalidParameterException("Saldo insuficiente.");
        }

        conta.setBalance(conta.getBalance() - amount);
        return amount;
    }


}
