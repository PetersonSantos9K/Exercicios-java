package C.Ex27;

import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma mensagem: ");
        String msg = sc.nextLine();

        SMS sms = new SMS(msg);

        sms.printFormatted();
        sc.close();
    }
}
