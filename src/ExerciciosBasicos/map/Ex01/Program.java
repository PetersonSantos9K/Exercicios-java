package ExerciciosBasicos.map.Ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    void main(){

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> electionResults = new HashMap<>();

        IO.println("Enter file full path: ");
        String path = sc.next();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (electionResults.containsKey(name)) {
                    int votesActual = electionResults.get(name);
                    electionResults.put(name, votes + votesActual);
                    continue;
                }
                electionResults.put(name, votes);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(String name : electionResults.keySet()){
            IO.println(name + ": " + electionResults.get(name));
        }


        sc.close();
    }

}
