package exerciciosDoWhile;

import java.util.Scanner;

        /*
        🔸Maior e Média: Faça um programa que leia 5 números
         e informe o maior número e a média desses números.
        */

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;
        int maior = 0;
        int contador = 0;
        int total = 0;

        do {

            System.out.println("Digite um valor: ");
            valor = input.nextInt();

            if(valor > maior){
                maior = valor;
            }

            ++contador;
            total += valor;

        } while (contador < 5);

        System.out.println("Maior valor: " + maior);
        System.out.printf("Valor médio dos valores digitados: %.2f", total/5);



    }
}
