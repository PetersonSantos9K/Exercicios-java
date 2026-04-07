package D.Ex30;

public interface PushNotifier {

    default void send(String msg){
        System.out.println("Enviando Push: " + msg);
    }


}
