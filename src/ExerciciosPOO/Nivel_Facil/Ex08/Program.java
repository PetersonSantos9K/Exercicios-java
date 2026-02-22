package ExerciciosPOO.Nivel_Facil.Ex08;

import ExerciciosPOO.Nivel_Facil.Ex08.model.Retangulo;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        System.out.println("Calcular area e perimetro de um retangulo.");


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos retangulos deseja criar: ");
        int n = sc.nextInt();
        Retangulo[] retangulos = new Retangulo[n];

        for(int i=0; i<n; i++){

            System.out.println((i+1) + "- Retangulo");
            System.out.println("Digite o comprimento: ");
            float comprimento = sc.nextFloat();

            System.out.println("Digite a largura: ");
            float largura = sc.nextFloat();
            retangulos[i] = new Retangulo();
            boolean addComprimento = retangulos[i].setComprimento(comprimento);
            boolean addLargura = retangulos[i].setLargura(largura);

            if(!addLargura || !addComprimento){
                System.out.println("Valor invalido, por favor digite novamente...");
                i--;
                continue;
            }

            System.out.println("Retangulo criado com sucesso.");
        }

        System.out.println("Qual retangulo deseja acessar: ");

        for(int i =0; i<retangulos.length; i++){

            System.out.println("\nOpção " + (i+1));
            System.out.println("Comprimento: " + retangulos[i].getComprimento());
            System.out.println("Largura: " + retangulos[i].getLargura());
            System.out.println();
        }

        System.out.println("Digite o numero do retagunlo que deseja acessar: ");
        int acessarRetanguloIndex = sc.nextInt();

        if(acessarRetanguloIndex > retangulos.length+1 || acessarRetanguloIndex <= 0 ){
            System.out.println("Numero Invalido.");
        } else {
            Retangulo retangulo = retangulos[acessarRetanguloIndex-1];
            System.out.println("Numero do retangulo selecionado: " + acessarRetanguloIndex);
            System.out.println("Comprimento: " + retangulo.getComprimento());
            System.out.println("Largura: " + retangulo.getLargura());

            System.out.println("Perimetro = " + retangulo.perimetro(retangulo.getComprimento(), retangulo.getLargura()));
            System.out.println("Area = " + retangulo.area(retangulo.getComprimento(), retangulo.getLargura()));
        }



        sc.close();


    }
}
