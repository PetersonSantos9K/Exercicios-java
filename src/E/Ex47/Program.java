package E.Ex47;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program{

    void main(){

        Scanner sc = new Scanner(System.in);

        Set<String> courses = new HashSet<>();

        IO.println("How many courses do you want to add?");
        int qtdCourses = sc.nextInt();
        if(qtdCourses == 0) {
            IO.println("Invalid value.");
            return;
        }

        int count = 0;
        while(qtdCourses > 0){
            count++;

            IO.println(count + "- Course name:");
            String courseName = sc.next();

            if(courseName.isEmpty()){
                IO.println("Invalid value.");
                return;
            }
            if(!courses.add(courseName)){
                IO.println("There is already a course with that name.");
                return;
            }
            qtdCourses--;
        }

        Set<Integer> idStudents = new HashSet<>();

        for(String course : courses){
            IO.println(String.format("How many students for course %s?", course));
            int studentsCourse = sc.nextInt();

            if(studentsCourse == 0 ){
                IO.println("Invalid value.");
                return;
            }

            while(studentsCourse > 0){

                IO.println("ID student: ");
                int idStudent = sc.nextInt();
                if(!idStudents.add(idStudent)){
                    IO.println("ID invalid: " + idStudent);
                    IO.println("This student is already enrolled in a course.");

                }
                studentsCourse--;
            }
        }

        if(idStudents.isEmpty()){
            IO.println("No students were added.");
            return;
        }
        IO.println("Total students: " + idStudents.size());
        sc.close();
    }

}
