package controle;

import java.util.Scanner;

public class If {

  public static void main(String[] args) {
    //Se a quantidade de if for grande o quebre em variaveis

    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Informe a media: ");
    double media = entrada.nextDouble();
    
    if(media >= 7.0) {
      System.out.println("Aprovado");
      System.out.println("Parabéns!");
    }
    
    if(media < 7 && media >= 4.5) {
      System.out.println("Recuperacao!");
      
      
      boolean criterioReprovacaoAtingindo =
          media < 4.5 && media >= 0;
      if(media < 4.5 && media <= 0) {
        System.out.println("Reprovado");
      
      
      /*    
      }
    if(media <= 10 && media >= 7.0) {
      System.out.println("Aprovado");
      System.out.println("Parabens");
    */  
        
    entrada.close();
    
  }

    }}}
