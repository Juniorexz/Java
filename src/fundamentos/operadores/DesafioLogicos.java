package fundamentos.operadores;

public class DesafioLogicos {

  public static void main(String[] args) {
    // Trabalho na terca (V ou F)
    // Trabalho na quinta (V ou F)
    
    boolean trabalho1 = true;
    boolean trabalho2 = true;
    
    
    boolean comprouTV50 = trabalho1 && trabalho2; //e
    boolean comprouTV32 = trabalho1 ^ trabalho2; //ou exclusivo
    boolean comprouSorvete = trabalho1 || trabalho2; //ou
    //Operador Unario!
    boolean maisSaudavel = !comprouSorvete;
    
    System.out.println("Comprou TV 50\"? " + comprouTV50);
    System.out.println("Comprou TV 32\"? " + comprouTV32);
    System.out.println("Comprou Sorvete? " + comprouSorvete);
    System.out.println("Mais Saudavel? " + maisSaudavel);  

  }

}
