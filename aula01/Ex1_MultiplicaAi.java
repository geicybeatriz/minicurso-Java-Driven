//import java.util.Scanner;

// Escreva um código que deve imprimir a tabela de multiplicação desse algum número fornecido, 
// e deve exibir um cabeçalho com o nome Tabela de multiplicação de X, onde X é o número a ser multiplicado

public class Ex1_MultiplicaAi {

  public static void main(String[] args) {
    //usando a classe Scanner:
      // Scanner scan = new Scanner(System.in);
      // int valor = scan.nextInt();
      // System.out.println("Tabela de multiplicação de X: ");
      // for(int i = 1; i <= 10; i++){
      //   System.out.println(valor + " X " + i + " = " + (valor*i));
      // }

    //com um valor fixo
      int numX = 9;
      System.out.println("Tabela de multiplicação de X: ");
      for(int i = 1; i <=10; i++){
        System.out.println(numX + " X " + i + " = " + (numX*i));
      }
  }
}