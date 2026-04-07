package C.Ex26.service.contract;

import C.Ex26.enums.StatusContract;
import C.Ex26.model.Conta;
import C.Ex26.model.Contract;
import C.Ex26.service.conta.ContaService;

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
