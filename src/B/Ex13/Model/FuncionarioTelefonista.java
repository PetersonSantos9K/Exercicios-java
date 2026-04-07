package B.Ex13.Model;

import B.Ex13.Enum.CargoEnum;

public class FuncionarioTelefonista extends Funcionario {

    public FuncionarioTelefonista(String nome){
        super(CargoEnum.TELEFONISTA, nome, 10.0);
    }

}
