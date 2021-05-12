package fundamentos.operadores;

import java.util.Scanner;
/**
 * Diferença entre %i e %d -%d é usado exclusivamente
 *  com números decimais inteiros,
 *  já o %i é usado apenas para inteiros (independente se a base é octal, decimal ou hexadecimal).
 * @param args
 *A função Math.sqrt() retorna a raiz quadrada de um número
 */


/*O método print imprime na tela e o cursor permanece exatamente 
* após o último caracetere impresso, ou seja, qualquer outra coisa
* q for impressa ou digitada virá imediatamente após (colada) 
* ao text impresso pelo print.
* O println imprime e dá uam quebra de linha (enter), 
* o cursor ficará posicionado na próxima linha, 
* tudo q for impresso ou digitado após o println virá na linha imediatamente
*  abaixo do q foi impresso pelo println.
*Por fim o printf (método da versão 5 de java, vale lembrar) é um método q
* imprime seguindo uma formatação ditada por uma String. Sendo mais explícito:
* O primeiro parâmetro desse método deve ser uma String contendo todos os comando 
* de formatação comandos de escape para que em seguida se passa uma lista de argumentos 
* q seguirão a formatação definida no primeiro parâmetro String passado.
 * 
 * 
 */



public class Bhaskara {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Equação: ax² + bx + c = 0");
            
            System.out.println("\nDigite o valor de A: ");
            int a = scanner.nextInt();

            System.out.println("\nDigite o valor de B: ");
            int b = scanner.nextInt();

            System.out.println("\nDigite o valor de C: ");
            int c = scanner.nextInt();

            int delta = (b * b) - (4 * a * c);

            System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
            
            System.out.println("\nO delta é: " + delta);

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.printf("O x1 da equação é: %.2f", x1);

            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("\nO x2 da equação é: %.2f" ,x2);
            
            scanner.close();
        }

    

  }


