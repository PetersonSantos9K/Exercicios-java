package ExerciciosBasicos.interfaceDefault.ex03;

public interface Authenticatable {

    SystemAcess getRole();

    default boolean hasAdminPrivileges(){
        return getRole() == SystemAcess.ADMIN;
    }
}
