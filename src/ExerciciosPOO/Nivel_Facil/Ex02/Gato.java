package ExerciciosPOO.Nivel_Facil.Ex02;

public class Gato extends Animal{

    private final String animal;

    public Gato(String animal){
        super(animal);
        this.animal = animal;
    }

    @Override
    public String getAnimal(){
        return this.animal;
    }

    @Override
    public String emitirSom(){
        return "Miau Miau... Miau Miau";
    }

}
