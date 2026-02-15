package ExerciciosBasicos;

public class Ex14 {
    public static void main(String[] args) {
        int mes = 21;

        switch (mes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
               break;
            default:
                System.out.println("Mes inválido!");
                break;
        }
    }
}
