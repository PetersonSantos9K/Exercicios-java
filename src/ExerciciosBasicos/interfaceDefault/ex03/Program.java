package ExerciciosBasicos.interfaceDefault.ex03;

import ExerciciosBasicos.interfaceDefault.ex03.model.Manager;
import ExerciciosBasicos.interfaceDefault.ex03.model.User;
import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager manager = new Manager("Admin", 0);

        System.out.println("How many accounts do you want to add?");
        int n = sc.nextInt();

        Random random = new Random();

        for(int i=0; i<n; i++){
            System.out.println("Account " + (i+1));
            System.out.print("Name: ");
            String nameUser = sc.next();
            manager.getListUsers().add(new User(nameUser, random.nextInt(10000) + 1));
        }

        System.out.println("----------ADIMIN----------");
        System.out.println(manager);
        System.out.println("--------------------");

        System.out.println("----------Users----------");
        for(User user : manager.getListUsers()){
            System.out.println(user);
        }



        sc.close();
    }
}
