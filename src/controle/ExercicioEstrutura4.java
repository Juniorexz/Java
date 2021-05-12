package controle;

import java.util.Scanner;

public class ExercicioEstrutura4 {

    //Um número primo é aquele que é dividido apenas por um e por ele mesmo.
    //Entre 0 e 100 existem apenas 25 números primos.
    //Criar um programa que receba um número e diga se ele é um número primo.

   public static void main(String[] args) {

       int contadorDeDivisores = 0;
       Scanner scanner = new Scanner(System.in);

       System.out.println("\nDigite um numero para verificar se é primo:");
       int numero = scanner.nextInt();

       for (int i = 2; i < numero; i++) {
           if (numero % i == 0) {
               contadorDeDivisores++;
           }
       }

       if (contadorDeDivisores == 0) {
           System.out.println("\nO numero " + numero + " é primo.");
       } else {
           System.out.println("\nO numero " + numero + " não é primo.");
       }

       scanner.close();


    
    
    
  }

}
