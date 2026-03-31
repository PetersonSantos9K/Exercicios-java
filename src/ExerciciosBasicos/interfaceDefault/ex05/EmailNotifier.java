package ExerciciosBasicos.interfaceDefault.ex05;

public interface EmailNotifier {

    default void send(String msg){
        System.out.println("Enviando Email: " + msg);
    }

}
