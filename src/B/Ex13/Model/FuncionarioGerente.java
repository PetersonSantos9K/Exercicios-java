package B.Ex13.Model;

import B.Ex13.Enum.CargoEnum;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(String nome){
        super(CargoEnum.GERENTE, nome, 45.0);
    }
}
