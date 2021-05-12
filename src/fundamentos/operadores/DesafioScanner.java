package fundamentos.operadores;

import java.util.Scanner;

public class DesafioScanner {

  public static void main(String[] args) {
    //Sempre com Scanner deve haver um entrada.close
    //Crie uma classe que leia as 3 entradas com next, onde seja permitido,
    //"." ou ",".Converte esse valor soma os 3 e calcula a media.
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe o primeiro salario");
    String valor1 = entrada.next().replace(",",".");
    
    System.out.println("Informe o segundo salario");
    String valor2 = entrada.next().replace(",",".");
    
    System.out.println("Informe o terceiro salario");
    String valor3 = entrada.next().replace(",",".");
    
    double salario1 = Double.parseDouble(valor1);
    double salario2 = Double.parseDouble(valor2);
    double salario3 = Double.parseDouble(valor3);
    
    double media = (salario1 + salario2 + salario3) /3;
    System.out.println("A media dos salarios  " + media);
    
    entrada.close();
  }

}
