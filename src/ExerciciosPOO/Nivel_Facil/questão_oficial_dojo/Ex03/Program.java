package ExerciciosPOO.Nivel_Facil.questão_oficial_dojo.Ex03;

public class Program {

    static void main(String[] args) {
        Produto pr = new Produto("Caneta", 2.00, 50);

        IO.println(pr.getNome());
        IO.println(pr.getPreco());
        IO.println(pr.getQuantidade());
        IO.println(pr.calcularTotal());
    }
}


