package controle;

import java.util.Scanner;

public class DoWhile {

  public static void main(String[] args) {
    //if(...) sentenca; ou {}
    //while(..) sentenca; ou {}
    //for(inicializacao;expressao;incremento) sentenca; ou {}
    //do {} while {...}; - unica que termina com (;)
    //O bloco costuma ser executado ao menos uma vez 
    Scanner entrada = new Scanner(System.in);
    
    String texto = "";
    
    
    do {
      System.out.println("Voce precisa falar"
          + "\nas palavras magicas...");
      System.out.print("Quer sair");
      texto = entrada.nextLine();
    } while(!texto.equalsIgnoreCase("por favor"));
    
    System.out.println("Obrigado");
    entrada.close();
  }

}
