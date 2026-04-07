package C.Ex28;

import C.Ex28.model.Manager;
import C.Ex28.model.User;

import java.util.Random;
import java.util.Scanner;

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
