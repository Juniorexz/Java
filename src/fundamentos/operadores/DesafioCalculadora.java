package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

  public static void main(String[] args) {
    //Calculadora com operador Ternario = Uma opera��o tern�ria � uma fun��o com tr�s vari�veis de entrada.
    // Ler num 1
    // Ler num 2
    // * - * / %
    /**O m�todo nextDouble () da classe java.util.Scanner 
     * verifica o pr�ximo token da entrada como um Double.
     *  Se a tradu��o for bem-sucedida, o scanner avan�a al�m da entrada correspondente.
     * 
     * % = modulo resto da divisao
     * %s = String
     * %d = Inteiro
     * %f = n�mero com ponto flutuante. Na verdade o "f" representa a v�rgula.
     *\t = tabula��o
     *\n = salto de linha
     /**% � obrigat�rio
     *arg_index: � o numero do argumento que vai ser mostrado
     *flags: �-� justifica a esquerda
     *�+� inclui um sinal de mais ou menos
     *�0� completa com zeros
     *�,� coloca um virgula, para os pontos flutuantes
     *" (" coloca n�meros negativos entre parenteses
     *width: � o n�mero minimo de numeros que ser�o mostrados
     *precision: vai ser usado s� se for usado para trabalhar com n�meros de pontos flutuantes
     *conversion: � o tipo de argumento que ser� formatado
     * 
     */
     
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe o n�mero: ");
    double num1 = entrada.nextDouble();
    
    System.out.println("Informe o n�mero: ");
    double num2 = entrada.nextDouble();
    
    System.out.println("Informe a opera��o");
    String op = entrada.next();
    
    //Logica
    double resultado = "+".equals(op) ? num1 + num2 : 0;
    resultado = "-".equals(op) ? num1 - num2 : resultado;
    resultado = "*".equals(op) ? num1 * num2 : resultado;
    resultado = "/".equals(op) ? num1 / num2 : resultado;
    resultado = "%".equals(op) ? num1 % num2 : resultado;
    
    System.out.printf("%.2f %s %.2f = %.2f",
        num1, op, num2, resultado);
    entrada.close();
  }

}
