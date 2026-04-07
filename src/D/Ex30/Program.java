package D.Ex30;

import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmarAlert smarAlert = new SmarAlert();

        System.out.println("Digite a mensagem que deseja enviar: ");
        String msg = sc.nextLine();

        smarAlert.send(msg);


        sc.close();


    }
}
