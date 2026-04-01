package ExerciciosBasicos.set.ex10.models;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Instrutor implements Comparable<Instrutor>{

    private final String instrutor;
    private final Set<Curso> cursos = new LinkedHashSet<>();

    public Instrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Instrutor instrutor1 = (Instrutor) o;
        return Objects.equals(instrutor, instrutor1.instrutor) && Objects.equals(cursos, instrutor1.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrutor, cursos);
    }

    @Override
    public int compareTo(Instrutor o) {
        return instrutor.compareTo(o.instrutor);
    }

    @Override
    public String toString() {


        return String.format("Nome: %s", instrutor);
    }
}




