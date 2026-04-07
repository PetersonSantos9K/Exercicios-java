package E.Ex46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ex09 {
    void main(){
        Scanner sc = new Scanner(System.in);
        List<String> emailList = new ArrayList<>();

        IO.println("Enter the path: ");
        String path = sc.next();
        sc.close();
        addEmails(path, emailList);
        if(emailList.isEmpty()){
            IO.println("The list is empty.");
        }

        List<String> duplicate = new ArrayList<>();
        Set<String> emails = new HashSet<>();

        for(String s : emailList){
            if(!emails.add(s)){
                duplicate.add(s);
            }
        }
        IO.println("Emails");
        IO.println(emails);

        if(!duplicate.isEmpty()){
            IO.println("Duplicate emails");
            IO.println(duplicate);
        }
    }

     void addEmails(String path, List<String> emailList){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                emailList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
