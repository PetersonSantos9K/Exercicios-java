package ExerciciosPOO.Nivel_Facil.Ex02;

public class Cachorro extends Animal {

    private final String animal;
    public Cachorro(String animal){
        super(animal);
        this.animal = animal;
    }

    @Override
    public String getAnimal(){
        return this.animal;
    }

    @Override
    public String emitirSom(){
        return "Au Au...Au Au";
    }
}

