package ExerciciosPOO.Nivel_Facil.Ex08.model;

public class Retangulo {

    private Float comprimento;
    private Float largura;

    public Float getLargura() {
        return largura;
    }

    public boolean setLargura(Float largura) {
        if (largura > 0 || largura < 20) {
            this.largura = largura;
            return true;
        }
        System.out.println("A largura precisa ser maior que 0 e menor que 20.");
        return false;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public boolean setComprimento(Float comprimento) {
        if (comprimento > 0 || comprimento < 20) {
            this.comprimento = comprimento;
            return true;
        }
        System.out.println("O comprimento precisa ser maior que 0 e menor que 20.");
        return false;
    }

    public float perimetro(float comprimento, float largura) {
        return 2 * (comprimento + largura);
    }

    public float area(float comprimento, float largura) {
        return comprimento * largura;
    }
}