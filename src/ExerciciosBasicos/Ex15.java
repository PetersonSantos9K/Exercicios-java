package ExerciciosBasicos;

public class Ex15 {

    static void main(String[] args) {
        for (int i=10; i<=20; i++){
            System.out.println(i);
        }

        int l = 1;
        while (l < 5){
            System.out.println("Valor de L: " + l);
            l++;
        }

        int i = 0;
        do {
            System.out.println("Valor de I: " + i);
            i++;
        } while (i < 10);

        for (int ii=0; ii<10; ii++){

            if(ii==5){continue;}
            System.out.println("Valor de I: " + ii);
        }
    }

}
