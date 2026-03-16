package ExerciciosBasicos.comparable.ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Raphael", 34));
        personList.add(new Person("Gabriel", 18));
        personList.add(new Person("Guilherme", 24));
        personList.add(new Person("Arthur", 24));

        Collections.sort(personList);

        for (Person person : personList){
            System.out.println(person);
        }

    }
}
