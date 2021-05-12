package classe;

public class PrimeiroTrauma {

     //Transformando em static a s variaveis ficam independentes do main
     int a = 3; // nao pode mexer aqui!!
     static int b = 4;
  
  public static void main(String[] args) {
    
    //Criar a primeira instancia
    PrimeiroTrauma p = new PrimeiroTrauma();
    System.out.println(p.a);
    System.out.println(b);
    
    //byte, short, int,long -> 0
    //float ,double -> 0.0
    //boolean -> false
    //char -> '\u0000'
    //Objetos -> null
    //devo definir o valor da constante
    //
    //
   
  }

}
