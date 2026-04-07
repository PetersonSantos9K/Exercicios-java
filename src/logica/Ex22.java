package logica;

public class Ex22 {
    static void main(String[] args) {

        int[] vetor = new int[]{1, 2, 3, 4, 5};



        int valorMaior = 0;
        for(int i =0; i< vetor.length; i++){
            if(valorMaior < vetor[i]){
                valorMaior = vetor[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + valorMaior);

        int menorValor = vetor[0];
        for(int i =1; i< vetor.length; i++){
            if(menorValor > vetor[i]){
                menorValor = vetor[i];
            }
        }

        System.out.println("O menor valor do vetor é: " + menorValor);

        int soma = 0;
        for(int i : vetor) {
            soma += i;
        }

        double média = (double) soma / vetor.length;
        System.out.println("A média dos valores do vetor é: " + média);
    }
}
