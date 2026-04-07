package A.Ex06.model;

public class Vegetta extends PersonagemDBZ{

    @Override
    public void transformar() {
        super.transformar();
        System.out.println(nome + " virou um Super saiajjin e disse: EU SOU O PRINCIPE DOS SAIYJINS!!!");
    }

    public void finalFlash(){
        System.out.println(nome + " lançou um final flash!!!");
    }
}
