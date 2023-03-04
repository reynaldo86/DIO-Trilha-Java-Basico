package exerciciosFor;

import java.util.Scanner;

        /*
        🔸Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
          Ex.: 5!=5.4.3.2.1=120
        */

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para saber seu factorial: ");
        int valor = input.nextInt();

        int result = 1;

        for (int i = 1; i <= valor; i++) {
            result *= i;
        }
        System.out.println("Fatorial de !" + valor + " = " + result);
    }
}
