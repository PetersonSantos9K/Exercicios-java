package ExerciciosBasicos;

public class Ex16 {

    static void main(String[] args) {
        int[] numeros = new int[5]; // vetor com 5 posiçoes alocdas na memoria
        String[] names = {"Name1"};
        for (int i=0; i<=numeros.length; i++){
            numeros[i] = (i+1);
            IO.println(numeros[i]);
        }
    }
}
