package br.edu.ifpi.dominio; 

public class Aluno{
    private String nome;
    private String email;
   
   
   public void setNome(String nome, String email) {
        this.nome = nome;
    }

    public String getNome( ) {
        return nome;
    }

    public String getEmail( ) {
        return email;
    }

    public Aluno(String nome, String email) {
        this.nome = nome; 
        this.email = email;   
    }

    }
        