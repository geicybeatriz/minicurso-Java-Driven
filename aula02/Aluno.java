package aula02;

public class Aluno {

  private String nome;
  private Integer idade;
  private String email;
  private String senha;

  //constructor
  public Aluno(String nome, Integer idade, String email, String senha){
    this.nome = nome;
    this.idade = idade;
    this.email = email;
    this.senha = senha;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getEmail() {
    return email;
  }

  public String getSenha() {
    return senha;
  }  

  @Override
  public String toString(){
    return "{" + "nome: '" + nome + '\'' + ", idade: '" + idade + '\'' + ", email: '" + email + '\'' + ", senha: '" + senha+ '\'' + '}';
  }

}
