package ExerciciosBasicos.set.ex10.models;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Curso implements Comparable<Curso> {

    private final String nome;
    private final Instrutor instrutor;

    private final Set<Aluno> alunos = new TreeSet<>();

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Curso o) {
        if(nome.compareTo(o.nome) != 0) return nome.compareTo(o.nome);
        return instrutor.compareTo(o.instrutor);
    }

    @Override
    public String toString() {

        return String.format("Nome do instrutor: %s | Nome do curso: %s", instrutor.getInstrutor(), nome);
    }
}
