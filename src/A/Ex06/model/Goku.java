package A.Ex06.model;

public class Goku extends PersonagemDBZ{

    @Override
    public void transformar() {
        System.out.println(nome + " se transformou em super saiyadin e gritou: KAMEHAMEHA!!!");
    }

    public void kamehameha(){
        System.out.println(nome + " lançou uma KAMEHAMEHA!!!");
    }

}
