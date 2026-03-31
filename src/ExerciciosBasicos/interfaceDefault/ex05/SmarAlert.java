package ExerciciosBasicos.interfaceDefault.ex05;

public class SmarAlert implements EmailNotifier, PushNotifier{
    @Override
    public void send(String msg){
        EmailNotifier.super.send(msg);
        PushNotifier.super.send(msg);
    }
}
