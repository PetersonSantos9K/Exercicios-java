package ExerciciosBasicos.logica;

public class Ex24 {
    static void main(String[] args) {

        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int maiorValor = vetor[0];
        int menorValor = vetor[0];

        int posicaoMaiorValor = 0;
        int posicaoMenorValor = 0;

        for (int i=1; i<vetor.length; i++){

            if(maiorValor < vetor[i]){
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }

            if(menorValor > vetor[i]){
                menorValor = vetor[i];
                posicaoMenorValor = i;
            }
        }

        int diferenca = maiorValor - menorValor;

        System.out.println("O maior valor do vetor é: " + maiorValor + " e está na posição: " + posicaoMaiorValor);
        System.out.println("O menor valor do vetor é: " + menorValor + " e está na posição: " + posicaoMenorValor);
        System.out.println("A diferença entre o maior e o menor valor do vetor é: " + diferenca);



    }
}
