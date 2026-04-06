package ExerciciosBasicos.set.ex15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    void main(){



        int[] numbers = new int[]{2,7,11,15};
        int[] numbersSum = new int[2];


        int target = 22;
        int value = numbers[0];

        int j = 0;
        for(int i=0; i<numbers.length; ){
            int sum = value + numbers[j];

            if(sum == target) {
                numbersSum[0] = value;
                numbersSum[1] = numbers[j];
                break;
            }

            j++;

            if(j > numbers.length-1){
                i++;
                j=0;
                value = numbers[i];
            }
        }
        IO.println(numbersSum[0] +" + "+ numbersSum[1]);

    }


}
