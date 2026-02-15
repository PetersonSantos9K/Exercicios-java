package ExerciciosBasicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04 {

    // vai ler um numero de 1 a 12 e imprimir o mes correspondente
    static void main() {

        ArrayList<Calendario> calendarios = new ArrayList<Calendario>();
        addM(calendarios);

        Scanner sc = new Scanner(System.in);

        boolean escolherMes = escolherMes(sc, calendarios);

        if(!escolherMes) {
            IO.println("Não existe um mes com esse numero!");
        }

        sc.close();
    }



    private static boolean escolherMes(Scanner sc, ArrayList<Calendario> list){

        sc = new Scanner(System.in);

        IO.println("Escolha um numero de 1-12 (Sera retornado um mes a parti desse numero).");
        int numberM = sc.nextInt();;

        if(numberM < 1 || numberM > 12 ){
            return  false;
        }

        IO.println("Mes escolhido foi: " + list.get(numberM -1).getNomeMes());
        return  true;
    };

    private static void addM(List<Calendario> e){
        e.add(new Calendario(1, "Janeiro"));
        e.add(new Calendario(2, "Fevereiro"));
        e.add(new Calendario(3, "Março"));
        e.add(new Calendario(4, "Abril"));
        e.add(new Calendario(5, "Maio"));
        e.add(new Calendario(6, "Junho"));
        e.add(new Calendario(7, "Julho"));
        e.add(new Calendario(8, "Agosto"));
        e.add(new Calendario(9, "Setembro"));
        e.add(new Calendario(10, "Outubro"));
        e.add(new Calendario(11, "Novembro"));
        e.add(new Calendario(12, "Dezembro"));
    }


}

class Calendario{

    private final Integer numero;
    private final String nomeMes;

    public Calendario(int numero, String nomeMes) {
        this.numero = numero;
        this.nomeMes = nomeMes;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public String getNomeMes(){
        return this.nomeMes;
    }
}