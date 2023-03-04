package exerciciosDoWhile;

import java.util.Scanner;

    /*
    🔸Par e Ímpar: Faça um programa que peça N números inteiros.
    Calcule e mostre a quantidade de números pares e a quantidade de números impares.
     */

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = 0;
        int par = 0;
        int impar = 0;
        int contador = 0;
        int repeticoes = 0;

        System.out.println("Entre com a quantidades de valores: ");
        repeticoes = input.nextInt();

        do{
            System.out.println("Digite um valor: ");
            valor = input.nextInt();

            if ((valor % 2) == 0){
                ++par;
            }else{
                ++impar;
            }
            contador++;

        }while(contador < repeticoes);

        System.out.println("Foram digitados " + par + " valores pares.");
        System.out.println("Foram digitados " + impar + " valores impares.");
    }

}
