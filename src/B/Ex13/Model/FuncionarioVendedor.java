package B.Ex13.Model;

import B.Ex13.Enum.CargoEnum;

public class FuncionarioVendedor extends Funcionario {

    public  FuncionarioVendedor(String nome){
        super(CargoEnum.VENDEDOR, nome, 25.0);
    }
}
