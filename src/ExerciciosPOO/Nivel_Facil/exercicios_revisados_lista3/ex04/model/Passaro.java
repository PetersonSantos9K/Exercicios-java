package ExerciciosPOO.Nivel_Facil.exercicios_revisados_lista3.ex04.model;

public class Passaro extends Animal{

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou um pássaro...");
    }

    public void voar() {
        System.out.println("Eu já sei voar...");
    }


}
