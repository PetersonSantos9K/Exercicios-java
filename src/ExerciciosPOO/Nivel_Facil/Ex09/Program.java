package ExerciciosPOO.Nivel_Facil.Ex09;

import ExerciciosPOO.Nivel_Facil.Ex09.model.Relogio;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Relogio relogio = new Relogio();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        int hora = sc.nextInt();

        System.out.println("Digite os minutos: ");
        int minuto = sc.nextInt();

        System.out.println("Digite os segundo: ");
        int segundos = sc.nextInt();

        boolean acertaRelogio = relogio.acertarRelogio(hora,minuto,segundos);
        if(!acertaRelogio){
            System.out.println("Valor invalido, o sistema vai ser encerrado...");
            return;
        }
        System.out.println(relogio.horaAtual());

        System.out.println("1-Proxima Hora | 2-Proximo Minuto | 3-Proximo Segundo | 4-Encerrar");

        int n = sc.nextInt();
        while (n > 0 && n < 4){

            switch (n){
                case 1:
                    relogio.proximaHora();
                    break;
                case 2:
                    relogio.proximoMinuto();
                    break;
                case 3:
                    relogio.proximoSegundo();
                    break;
            }
            System.out.println(relogio.horaAtual());
            System.out.println("1-Proxima Hora | 2-Proximo Minuto | 3-Proximo Segundo | 4-Encerrar");
            n = sc.nextInt();
        }



        sc.close();

    }
}
