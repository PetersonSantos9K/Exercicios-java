package ExerciciosBasicos.interfaceDefault.ex02;

public interface Messenger {

    public String getRawContent();
    default void printFormatted(){
        System.out.printf("\n*** %s ***\n", getRawContent());
    }

}
