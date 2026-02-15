package ExerciciosBasicos;

public class Ex08 {

    static void main() {
        int soma = 0;
        for (int i=250; i<=500; i++){
            if(i % 2 != 0){
                IO.println(i);
                soma += i;
            }
        }
        IO.println("SOMA: " + soma);
    }
}
