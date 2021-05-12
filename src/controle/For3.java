package controle;

public class For3 {

  public static void main(String[] args) {
    //For dentro de um for
    //Escopo ao definir uma variavel dentro de um laco(bloco) vai estar restrita a ele
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        System.out.printf("[%d %d]", i, j);
      }
        System.out.println();
      }

    }
    
}   
    

    
    /*Permite usar a variavel i fora do for
      int i = 0;
      for(; i < 10; i++) {
           System.out.println(i);
      }
    
      System.out.println("Saiu do for...");
      System.out.println(i);
    */
    
  
