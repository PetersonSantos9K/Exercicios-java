package ExerciciosBasicos.interfaceDefault.ex01.service.contract;

import ExerciciosBasicos.interfaceDefault.ex01.enums.StatusContract;
import ExerciciosBasicos.interfaceDefault.ex01.model.Conta;
import ExerciciosBasicos.interfaceDefault.ex01.model.Contract;
import ExerciciosBasicos.interfaceDefault.ex01.service.conta.ContaService;

import java.security.InvalidParameterException;

public class PayContract {


    static void processPayContract(final Conta conta, final Contract contract){

        if(conta == contract.getBroadcaster()){
            throw new InvalidParameterException("A conta não pode pagar o proprio contrato que emitiu.");
        }

        double valueContract = contract.getAmount();

        double value = ContaService.sacar(conta, valueContract);
        ContaService.deposit(contract.getBroadcaster(), value);
        contract.setStatusContract(StatusContract.PAGO);
    }

}
