package br.edu.ifpi.dominio;
import java.util.ArrayList;
import java.util.List;

public class Curso {
   
    private String nome;
    private String nivel;
    private String professor;
    private List<Aluno> alunos;

    public void setCurso (String nome, String nivel, String professor ){
        this.nome = nome;
        this.nivel = nivel;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        
    }

    public void setrealizarMatricula(Aluno aluno){ 
        this.alunos.add(aluno);
    }

    public int getAlunosMatriculados(){  
        return this.alunos.size();
    }

    

    
}