package br.edu.ifpi.dominio;

public class Certificado {
    private String nome;
    private String curso;
    private String CargaHoraria;

public void setCertificado(String nome, String curso, String CargaHoraria){
    this.nome = nome;
    this.curso = curso;
    this.CargaHoraria = CargaHoraria;

}

public void setFazerCertificado(String nome, String curso, String CargaHoraria ) {
    this.nome = nome;
    this.curso = curso;
    this.CargaHoraria = CargaHoraria; 
    
}

public String getReceberCertificado( ){
    return nome;

}

public String getCurso( ) {
    return curso;
}

public String getCargaHoraria( ) {
    return CargaHoraria;
}

public Certificado(String nome, String curso, String CargaHoraria){
    this.nome = nome;
    this.curso = curso;
    this.CargaHoraria = CargaHoraria;

}

}
