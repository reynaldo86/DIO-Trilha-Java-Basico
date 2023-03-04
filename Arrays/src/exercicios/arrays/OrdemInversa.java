package exercicios.arrays;
/*
🔹Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros
 e mostre-os na ordem inversa.

 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetor  = {4,5,76,43,-7};

        System.out.println("Vetor: ");
        int contador = 0;

        while(contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.println("\nVetor: ");

        for(int i = (vetor.length -1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }



    }
}