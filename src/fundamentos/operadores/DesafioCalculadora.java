package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

  public static void main(String[] args) {
    //Calculadora com operador Ternario = Uma operação ternária é uma função com três variáveis de entrada.
    // Ler num 1
    // Ler num 2
    // * - * / %
    /**O método nextDouble () da classe java.util.Scanner 
     * verifica o próximo token da entrada como um Double.
     *  Se a tradução for bem-sucedida, o scanner avança além da entrada correspondente.
     * 
     * % = modulo resto da divisao
     * %s = String
     * %d = Inteiro
     * %f = número com ponto flutuante. Na verdade o "f" representa a vírgula.
     *\t = tabulação
     *\n = salto de linha
     /**% é obrigatório
     *arg_index: é o numero do argumento que vai ser mostrado
     *flags: “-” justifica a esquerda
     *“+” inclui um sinal de mais ou menos
     *“0” completa com zeros
     *“,” coloca um virgula, para os pontos flutuantes
     *" (" coloca números negativos entre parenteses
     *width: é o número minimo de numeros que serão mostrados
     *precision: vai ser usado só se for usado para trabalhar com números de pontos flutuantes
     *conversion: é o tipo de argumento que será formatado
     * 
     */
     
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Informe o número: ");
    double num1 = entrada.nextDouble();
    
    System.out.println("Informe o número: ");
    double num2 = entrada.nextDouble();
    
    System.out.println("Informe a operação");
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
