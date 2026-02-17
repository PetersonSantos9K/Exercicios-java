package ExerciciosPOO.Nivel_Facil.Ex04.Model;

import ExerciciosPOO.Nivel_Facil.Ex04.Enum.CargoEnum;

public class FuncionarioVendedor extends Funcionario{

    public  FuncionarioVendedor(String nome){
        super(CargoEnum.VENDEDOR, nome, 25.0);
    }
}
