package fundamentos.operadores;

import java.util.Scanner;
/**
 * Diferen�a entre %i e %d -%d � usado exclusivamente
 *  com n�meros decimais inteiros,
 *  j� o %i � usado apenas para inteiros (independente se a base � octal, decimal ou hexadecimal).
 * @param args
 *A fun��o Math.sqrt() retorna a raiz quadrada de um n�mero
 */


/*O m�todo print imprime na tela e o cursor permanece exatamente 
* ap�s o �ltimo caracetere impresso, ou seja, qualquer outra coisa
* q for impressa ou digitada vir� imediatamente ap�s (colada) 
* ao text impresso pelo print.
* O println imprime e d� uam quebra de linha (enter), 
* o cursor ficar� posicionado na pr�xima linha, 
* tudo q for impresso ou digitado ap�s o println vir� na linha imediatamente
*  abaixo do q foi impresso pelo println.
*Por fim o printf (m�todo da vers�o 5 de java, vale lembrar) � um m�todo q
* imprime seguindo uma formata��o ditada por uma String. Sendo mais expl�cito:
* O primeiro par�metro desse m�todo deve ser uma String contendo todos os comando 
* de formata��o comandos de escape para que em seguida se passa uma lista de argumentos 
* q seguir�o a formata��o definida no primeiro par�metro String passado.
 * 
 * 
 */



public class Bhaskara {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Equa��o: ax� + bx + c = 0");
            
            System.out.println("\nDigite o valor de A: ");
            int a = scanner.nextInt();

            System.out.println("\nDigite o valor de B: ");
            int b = scanner.nextInt();

            System.out.println("\nDigite o valor de C: ");
            int c = scanner.nextInt();

            int delta = (b * b) - (4 * a * c);

            System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
            
            System.out.println("\nO delta �: " + delta);

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.printf("O x1 da equa��o �: %.2f", x1);

            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
            
            scanner.close();
        }

    

  }


