package ExerciciosBasicos;

public class Ex25 {

    static void main(String[] args) {

        int[] vetorA = new int[]{1, 2, 3, 4, 5};
        int[] vetorB = new int[]{6, 7, 8, 9, 10};

        int[] vetorC = new int[vetorA.length + vetorB.length];

        for(int i=0; i<vetorA.length; i++){
            vetorC[i] = vetorA[i];
        }

        for(int i=0; i<vetorB.length; i++){
            vetorC[vetorA.length + i ] = vetorB[i];
        }

        for(int a : vetorA) System.out.println(a);
        for(int b : vetorB) System.out.println(b);

        for(int i : vetorC) System.out.println(i);


    }
}
