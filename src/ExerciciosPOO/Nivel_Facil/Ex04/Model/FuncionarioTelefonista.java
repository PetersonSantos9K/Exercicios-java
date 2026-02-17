package ExerciciosPOO.Nivel_Facil.Ex04.Model;

import ExerciciosPOO.Nivel_Facil.Ex04.Enum.CargoEnum;

public class FuncionarioTelefonista extends Funcionario{

    public FuncionarioTelefonista(String nome){
        super(CargoEnum.TELEFONISTA, nome, 10.0);
    }

}
