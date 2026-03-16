package ExerciciosBasicos.comparable.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Joao", 22));
        students.add(new Student("Maria", 18));
        students.add(new Student("Carlos", 25));

        Collections.sort(students);

        for (Student student : students){
            System.out.println(student);
        }

    }

}
