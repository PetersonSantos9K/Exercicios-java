package C.Ex28.model;

import C.Ex28.Authenticatable;
import C.Ex28.SystemAcess;

public record User(String name, Integer code) implements Authenticatable {

    @Override
    public SystemAcess getRole() {
        return SystemAcess.USER;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Code: %d", name(), code());
    }
}

