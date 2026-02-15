package ExerciciosBasicos;

public class Ex10 {

    static void main() {

        int soma = 0;
        for(int i=500; i>=250; i--){

            if(i % 2 ==0){
                IO.println("Pares: " + i);
                soma +=i;
            }
        }
        IO.println("Soma final: " + soma);

    }

}
