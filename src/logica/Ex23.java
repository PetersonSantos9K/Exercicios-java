package logica;

public class Ex23 {

    static void main(String[] args) {

        int[] vetorA = new int[]{1, 2, 3, 4, 5};
        int[] vetorB = new int[]{6, 7, 8, 9, 10};

        int[] vetorSoma = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("A soma dos vetores A e B é: ");
        for(int i : vetorSoma){
            System.out.println(i);
        }

    }
}
