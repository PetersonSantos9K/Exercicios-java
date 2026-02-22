package ExerciciosPOO.Nivel_Facil.Ex07;

import ExerciciosPOO.Nivel_Facil.Ex07.model.Motocicleta;
import ExerciciosPOO.Nivel_Facil.Ex07.model.Veiculo;

public class Program {

    static void main(String[] args) {
        Motocicleta moto = new Motocicleta();
        moto.moverVeiculo();
        moto.estacionar();
        /* Explicação -> no exercicio a auxencia do extends na class Motocicleta ocasionou o erro, pois ela não tinha se tornado uma subclasse de veiculo.
         e não teria como utilizar o metodo moverVeiculo que foi implementado na classe Veiculo.
        */
        /*
         Veiculo vei = new Veiculo();
         vei.estacionar();
         Explicação -> o metodo estacionar so foi implementado na subclasse Motocicleta, não sendo possivel acessar.
         Par resolver esse problema deve ser criado o mesmo metodo na classe Veiculo com uma mensagem generica, e
         na classe motocicleta vamos utilizar o @Override para reescrever o metodo.
         */

        Veiculo vei = new Veiculo();
        vei.estacionar();
    }
}
