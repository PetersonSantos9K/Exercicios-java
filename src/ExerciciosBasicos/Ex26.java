package ExerciciosBasicos;

public class Ex26 {

    static void main(String[] args) {



        int[] vetorA = new int[]{8, 2, 3, 4, 5,9,11,22,1};
        int[] newVetor = new int[vetorA.length];
        for(int i=0; i<vetorA.length; i++){

            for (int j=0; j<vetorA.length; j++){
                if(vetorA[i] < vetorA[j]){
                    int aux = vetorA[i];
                    vetorA[i] = vetorA[j];
                    vetorA[j] = aux;
                }
            }

        }

        for(int i : vetorA) System.out.println(i);




    }
}
