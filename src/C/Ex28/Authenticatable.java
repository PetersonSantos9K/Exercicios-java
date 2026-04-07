package C.Ex28;

public interface Authenticatable {

    SystemAcess getRole();

    default boolean hasAdminPrivileges(){
        return getRole() == SystemAcess.ADMIN;
    }
}
