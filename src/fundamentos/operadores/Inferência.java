package fundamentos.operadores;

public class Inferência {

  public static void main(String[] args) {
    // Pela inferência vai entender que a variavel não precisa que o seu tipo seja determinado sempre.
    
    double a = 4.5;
    System.out.println(a);
    
    a = 12.57;
    System.out.print(a);
    
    var b = 4.5;
    System .out.println(b);
    
    var c = "Texto";
    c = "Outro texto";
    System.out.println(c);

  }

}
