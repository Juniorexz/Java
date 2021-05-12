package classe;

public class AreaCirc {
  //Pow metodo estatico ,pertence diretamente a classe
  //Alterar a variavel que pertence a instancia e dizer que pertence a classe com o static
  //o valor de pi esta associado a classe nao a instancia
   
    double raio;
    static final double PI = 3.1415;
    
    AreaCirc(double raioInicial){
      raio = raioInicial;
    }
    
    double area() {
      return PI * Math.pow(raio, 2);
    }
    
    static double area(double raio) {
      return PI * Math.pow(raio, 2);
    }
}
