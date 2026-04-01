package ExerciciosBasicos.set.ex10;

import ExerciciosBasicos.set.ex10.models.Aluno;
import ExerciciosBasicos.set.ex10.models.Curso;
import ExerciciosBasicos.set.ex10.models.Instrutor;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program{

    void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Sistema básico de gestão de curso");
        Instrutor instrutor = new Instrutor("Marcos");
        IO.println("Instrutor " + instrutor.getInstrutor());

        IO.println("Quantos curso vai adicionar: ");
        int qtdCurso = sc.nextInt();

        int countCurso = 0;
        while (qtdCurso > 0) {
            countCurso++;

            IO.println(countCurso+ "- Digite o nome do curso: ");
            String nomeCurso = sc.next();
            instrutor.getCursos().add(new Curso(nomeCurso, instrutor));
            qtdCurso--;
        }

        if(instrutor.getCursos().isEmpty()){
            IO.println("Nenhum curso foi adicionado, portanto o sistema será finalizado.");
            return;
        }


        IO.println("Deseja remover algum curso: 1-SIM | 2-NÂO");

        int rmvCurso = sc.nextInt();

        if(rmvCurso == 1){
            IO.println("Digite o nome do curso: ");
            String rmvCursoNome = sc.next();
            boolean checkRemoveCurso = instrutor.getCursos().removeIf((c) -> c.getNome().equals(rmvCursoNome));
            IO.println(checkRemoveCurso?"Curso removido com sucesso.": "Não foi possivel remover o curso.");
        }

        IO.println("Quantos alunos deseja adicionar: ");
        int qtdAlunos = sc.nextInt();
        Set<Aluno> alunos = new TreeSet<>();
        int countAluno = 0;
        while(qtdAlunos > 0){
            countAluno++;

            IO.println(countAluno + "- Digite o nome do aluno: ");
            String nomeAluno = sc.next();
            alunos.add(new Aluno(nomeAluno));
            qtdAlunos--;
        }

        if(alunos.isEmpty()) {
            IO.println("Nenhum aluno foi adicionado, portanto o sistema será finalizado.");
            return;
        }


        IO.println("Deseja acessar o perfil de algum aluno: 1-SIM | 2-NÂO");
        int accessPerfil = sc.nextInt();

        if(accessPerfil != 1){
            IO.println("Sistema finalizando...");
            return;
        }

        for(Aluno aluno : alunos){
            IO.println(aluno);
        }

        IO.println("Digite o nome do aluno que deseja acessar o perfil: ");
        String alunoPefil = sc.next();

        Aluno alunoPrl = null;
        for(Aluno aluno: alunos){
            if(aluno.getNome().equals(alunoPefil)){
                alunoPrl = aluno;
                break;
            }
        }

        if(alunoPrl == null){
            IO.println("Não foi possivel encotrar um perfil com esse nome.");
            return;
        }

        IO.println("Perfil encontrado com sucesso:");
        IO.println(alunoPrl.toString());

        IO.println("Deseja adicionar algum curso: 1-SIM | 2-NÂO");
        int addCursoPerfil = sc.nextInt();

        if(addCursoPerfil != 1){
            IO.println("O programa será finalizado...");
            return;
        }

        for(Curso curso : instrutor.getCursos()){
            IO.println(curso);
        }

        IO.println("Escreve o nome do curso que deseja adicionar a esta conta: ");
        String nomeCursoAddPerfil = sc.next();

        for(Curso curso : instrutor.getCursos()){

            if(curso.getNome().equals(nomeCursoAddPerfil)) {
                alunoPrl.getCurso().add(curso);
                break;
            }
        }


        IO.println("Programa chegou ao fim, vamos enviar todos os dados. ");

        IO.println("Instrutor: " + instrutor.getInstrutor());

        for(Curso curso : instrutor.getCursos()){
            IO.println("Curso: ");
            IO.println(curso);
        }

        for(Aluno aluno : alunos){
            IO.println("Aluno: ");
            IO.println(aluno);
        }




        IO.println("Informamos que esse program tem como um único objetivo treinar e práticar alguns conceitos importantes de java.");


    }

}
