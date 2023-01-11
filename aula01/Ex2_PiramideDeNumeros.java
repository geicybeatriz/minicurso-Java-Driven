// Crie utilizando tudo que aprendeu até o momento, uma pirâmide de números, 
// onde você deve imprimir em cada linha separada a quantidade de números que está sendo iterado no momento! 

public class Ex2_PiramideDeNumeros {
  public static void main(String[] args) {
    for(int linha = 1; linha <=5; linha++){
      for (int coluna = 1; coluna <= linha; coluna++){
        System.out.print(linha);
      }
      System.out.println();
    }
  }
  
}
