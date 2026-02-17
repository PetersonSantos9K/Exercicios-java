package ExerciciosPOO.Nivel_Facil.Ex04.Model;

import ExerciciosPOO.Nivel_Facil.Ex04.Enum.CargoEnum;

public class FuncionarioGerente extends Funcionario{

    public FuncionarioGerente(String nome){
        super(CargoEnum.GERENTE, nome, 45.0);
    }
}
