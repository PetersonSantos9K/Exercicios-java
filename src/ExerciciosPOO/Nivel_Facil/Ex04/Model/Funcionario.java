package ExerciciosPOO.Nivel_Facil.Ex04.Model;

import ExerciciosPOO.Nivel_Facil.Ex04.Enum.CargoEnum;

import java.util.ArrayList;


public class Funcionario extends Pessoa {

    private CargoEnum cargoEnum;
    private final Double salarioLiquido = 2000.0;
    private Double porcentagem;

    public Funcionario(CargoEnum cargoEnum, String nome, Double porcentagem) {
        super(nome);
        this.cargoEnum = cargoEnum;
        this.porcentagem = porcentagem;
    }

    public Funcionario(){};

    protected String getCargoEnum(){
        return cargoEnum.name();
    };

    protected Double getSalarioLiquido(){
        return salarioLiquido;

    };

    protected Double getPorcentagem(){
        return porcentagem;
    }

    public Double valorTotal(){
        double porcentagem = getSalarioLiquido() * (getPorcentagem() / 100);
        return getSalarioLiquido() +porcentagem;
    }


    public String imprimirFolhaPagamento() {

        return String.format("Nome: %s | Cargo: %s | Salario: %.2f\n", getNome(), getCargoEnum(), valorTotal());
    }
}
