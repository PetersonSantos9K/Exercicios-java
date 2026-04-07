package D.Ex38;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

    void main(){

        Set<User> users = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Your csv file will need to follow the following format: name, yyyy-MM-DDTHH:mm:ss");
        System.out.println("Enter the csv path:");
        String pathFile = sc.next();
        try(BufferedReader br = new BufferedReader(new FileReader(pathFile.trim()))){
            String line;
            while((line = br.readLine()) != null){
                String[] logData = line.split(",");
                users.add(new User(logData[0].trim(), logData[1].trim()));
            }

            print(users);
        } catch (IOException e) {
            System.out.println("Unable to find the file in the given path:" + e.getMessage());
        }
    }

    private <T> void print(Set<T> set){

        if(set.isEmpty()){
            IO.println("It's empty");
        }
        IO.println("Number of elements: " + set.size() );
        for(T type: set){
            IO.println(type);
        }

    }
}
