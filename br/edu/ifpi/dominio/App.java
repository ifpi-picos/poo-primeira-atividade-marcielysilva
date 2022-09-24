package br.edu.ifpi.dominio;

public class App {
   private String Aluno;
   private String Professor;
   private String Curso;
   private String Certificado;
   
public void setApp(String Aluno,  String Professor, String Curso, String Certificado){
   this.Aluno = Aluno;
   this.Professor = Professor;
   this.Curso = Curso;
   this.Certificado = Certificado;
}
public void setDigitarInformacao(String Aluno, String Professor, String Curso, String Certificado){
   this.Aluno = Aluno;
   this.Professor = Professor;
   this.Curso = Curso;
   this.Certificado = Certificado;
}
public String getAluno(){
   return Aluno;
}
public String getProfessorString(){
   return Professor;
}
public String getCurso(){
   return Curso;
}
public String Certificado(){
   return Certificado;
}

}
