package fundamentos.operadores;

public class Aritmeticos {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    System.out.println(2+3);
    
    var x =34.56;
    double y = 2.2;
    
    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    
    int a = 8;
    int b = 3;
    
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a / (double) b);//Double tem uma maior precisao que o float
    System.out.println(a / (float) b);

    
    System.out.println(a % b);//Modulo = resto da divisao;
    System.out.println(8 % 3);
    
    System.out.println(x + y - a * b);

  }

}
