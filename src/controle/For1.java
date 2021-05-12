package controle;

public class For1 {

  //Estrutura focada em declaracao de variavel,expressao de verdadeiro ou falso
  //(Que vai determinar se vai continuar repetindo ou vai parar,manipulacao de variavel de controle para que pare de executar) 
  //Se utiliza o for para uma quantidade determinada de repetições
  public static void main(String[] args) {      
      for (int contador = 0; contador <= 20; contador ++) {
        //for (int contador = 1; contador <= 20; contador ++) {

        System.out.printf("i = %d\n", contador);

      }   
      
      int x =2;
      for(; x < 10;) {
        System.out.println("x = " + x);
      x++;
      }
      
      /*
       * Laço infinito!!!
       //for(;;){
        * System.out.println("Fim!");
       */
      
      
  }

}
