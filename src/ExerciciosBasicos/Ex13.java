package ExerciciosBasicos;

public class Ex13 {

    public static void main(String[] args) {
        String nomeAluno = "Peterson";
        int idadeAluno = 18;
        double alturaAluno = 1.85;

        if(idadeAluno >= 18 && alturaAluno > 1.80){
            System.out.println("Aceito para equipe de basquete.");
        } else {
            System.out.println("Não aceito para equipe de basquete.");
        }
    }
}
