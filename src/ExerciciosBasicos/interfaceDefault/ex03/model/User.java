package ExerciciosBasicos.interfaceDefault.ex03.model;

import ExerciciosBasicos.interfaceDefault.ex03.Authenticatable;
import ExerciciosBasicos.interfaceDefault.ex03.SystemAcess;

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

