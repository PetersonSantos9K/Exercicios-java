package ExerciciosBasicos;

public class Ex12 {
    public static void main(String[] args) {
        double nota1 = 10;
        double nota2 = 4;
        double nota3 = 3;
        double media = (nota1+nota2+nota3) / 3;

        System.out.println("A média é: " + media);
        if(media >= 6) {
            IO.println("Aluno aprovado");
        } else if(media >= 5 && media < 6){
            IO.println("Aluno de recuperação");
        } else {
            IO.println("Aluno reprovado");
        }

    }
}
