package ExerciciosPOO.Nivel_Facil.Ex02;

public abstract class Animal {

    private final String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public abstract String getAnimal();

    public abstract String emitirSom();
}
