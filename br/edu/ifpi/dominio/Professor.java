package br.edu.ifpi.dominio;

public class Professor {
    private String nome;
    private String email;
    private String formacao;

public void setProfessor(String nome, String email, String formacao){
    this.nome = nome;
    this.email = email;
    this.formacao = formacao; 
}

public void setCadastrarProfessor(String nome, String email, String formacao){
    this.nome = nome;
    this.email = email;
    this.formacao = formacao; 
}

public void setDadosProfessor(String nome, String email, String formacao){
    this.nome = nome;
    this.email = email;
    this.formacao = formacao; 
}  

public String getDadosFinalizado(){
    return nome;
}
}
