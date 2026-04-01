package ExerciciosBasicos.set.ex10.models;

import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Aluno implements Comparable<Aluno>{

    private final String nome;
    private final Integer id;
    private final Set<Curso> curso = new TreeSet<>();

    public Aluno(String nome) {
        this.nome = nome;

        Random random = new Random();
        this.id = random.nextInt(100);
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public Set<Curso> getCurso() {
        return curso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso);
    }

    @Override
    public int compareTo(Aluno o) {
        if(nome.compareTo(o.nome) != 0) return  nome.compareTo(o.nome);
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Id: %d", nome, id);
    }
}
