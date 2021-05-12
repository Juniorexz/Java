package controle;

import java.util.Scanner;

public class ExercicioEstrutura5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   //Criar um programa que receba um número e diga se ele é um número primo.
   //utilizando a estrutura switch. */

    int contadorDeDivisores = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nDigite um numero para verificar se é primo:");
    int numero = scanner.nextInt();

    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            contadorDeDivisores++;
        }
    }

    switch (contadorDeDivisores) {

    case 0:
        System.out.println("O numero " + numero + " é um numero primo.");
        break;

    default:
        System.out.println("O numero " + numero + "  não é um numero primo.");

    }

    scanner.close();

}
}