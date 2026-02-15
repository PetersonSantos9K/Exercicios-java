package ExerciciosBasicos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    // Média Aritmética Ponderada - MAP;

    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Quantas notas deseja adicionar?");
        int n = sc.nextInt();

        ArrayList<Nota> map = new ArrayList<Nota>();

        for (int i=0; i<n; i++){
            System.out.printf("%d- Digite a nota: \n", i+1);
            double nota = sc.nextDouble();
            System.out.printf("%d- Digite o peso da nota: \n", i+1);
            int peso = sc.nextInt();
            map.add(new Nota(nota, peso));
        }

        sc.close();

        double notaAndPeso = 0;
        double somaPeso = 0;
        for (int i=0; i<map.size(); i++){

            double nota = map.get(i).getNota();
            int peso = map.get(i).getPeso();

            notaAndPeso +=nota * peso;
            somaPeso += peso;
            System.out.println(i+1+"- Nota: " + nota);
            System.out.println(i+1+"- Peso da Nota: " + peso);
        }
        System.out.println(notaAndPeso+ " | " + somaPeso);
        double mediaMAP = notaAndPeso/somaPeso;
        IO.println(mediaMAP);


    }

}


class Nota{
    private final Double nota;
    private final Integer peso;

    public Nota(Double nota, Integer peso) {
        this.nota = nota;
        this.peso = peso;
    }


    public Double getNota() {
        return nota;
    }

    public Integer getPeso() {
        return peso;
    }
}
