package aula02;

// Sabemos que existe uma plataforma muito famosa (respondeAí), 
// que busca ajudar as pessoas estudantes que estão com dificuldade em algumas matérias. 
// Pensando em algo que possa representar essa plataforma, 
// escreva pelo menos 2 classes com propriedades e métodos 
// que possa representar o modelo da plataforma! 
// Atenção, use da melhor maneira a composição, encapsulamento e as boas práticas que aprendeu em aula!

public class Ex1_RepresentaMundo {

  public static void main(String[] args) {

    Aluno aluno = new Aluno("Geicy", 27, "biadev@gmail.com", "123confidencial");

    System.out.println(aluno);
  }
}