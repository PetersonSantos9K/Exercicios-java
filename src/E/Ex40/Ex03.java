package E.Ex40;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

    void main(){

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        Set<Integer> setNumberDuplicate = new HashSet<>();

        IO.println("How many numbers do you want to add?");
        int qtdNumbers = sc.nextInt();

        while(qtdNumbers > 0){
            IO.print("Number: ");
            int number = sc.nextInt();
            if(!set.add(number)){
                setNumberDuplicate.add(number);
            }
            qtdNumbers--;
        }

        IO.println("Numbers: ");
        for(Integer number : set ){
            IO.println(number);
        }
        if(!setNumberDuplicate.isEmpty()) {
            IO.println("There is a duplicate number.");
            IO.println("Numbers duplicate: ");
            for(Integer number : setNumberDuplicate){
                IO.println(number);
            }
        }
        sc.close();
    }


}
