package C.Ex28.model;

import C.Ex28.Authenticatable;
import C.Ex28.SystemAcess;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Authenticatable {

    private final String name;
    private final Integer code;

    private final List<User> listUsers = new ArrayList<>();

    public Manager(final String name, final int code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    public List<User> getListUsers() {
        return listUsers;
    }

    @Override
    public SystemAcess getRole() {
        return SystemAcess.ADMIN;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Code: %d | Quantity Users: %d", getName(), getCode(), getListUsers().size());
    }
}
