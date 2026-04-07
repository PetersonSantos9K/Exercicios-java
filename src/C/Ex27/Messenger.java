package C.Ex27;

public interface Messenger {

    public String getRawContent();
    default void printFormatted(){
        System.out.printf("\n*** %s ***\n", getRawContent());
    }

}
