package D.Ex30;

public interface EmailNotifier {

    default void send(String msg){
        System.out.println("Enviando Email: " + msg);
    }

}
