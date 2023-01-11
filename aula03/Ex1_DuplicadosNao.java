package aula03;

import java.util.ArrayList;
import java.util.List;

// Escreva um código que encontre os elementos em comum que existem em dois arrays 
// e imprima os nomes dos itens em comum!

public class Ex1_DuplicadosNao {
  public static void main(String[] args) {
    List<String> turmaA = new ArrayList<>(){{
      add("Geicy");
      add("Barbara");
      add("Mariana");
      add("Marcus");
      add("Hudson");
    }};

    List<String> turmaB = new ArrayList<>(){{
      add("Ana");
      add("Geicy");
      add("Marina");
      add("Marcus");
      add("Beatriz");
    }};

    for(String aluno : turmaA){
      if(turmaB.contains(aluno)){
        System.out.println("Nome duplicado: " + aluno);
      };
    }
  }
}
