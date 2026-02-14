package ExerciciosPOO.Nivel_Facil.Ex02;

public class Program {

    static void main() {

        Gato2 gato = new Gato2("Gato");
        String gatoSom = gato.emitirSom("Miau Miau");

        Gato2 gato2 = (Gato2) new Animal2("Gato");
        Animal2 animal = new Gato2("Gato");
    }
}
