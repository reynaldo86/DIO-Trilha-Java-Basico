package exercicios.arrays;

    /*
    🔹Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
     armazene-os num vetor. Ao final, mostre os números e seus sucessores.
     */

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for(int i =0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatórios:");
        for (int num: numerosAleatorios) {
            System.out.print(num + " ");
        }

        System.out.println("\nSucessores dos numeros aleatórios:");
        for (int num: numerosAleatorios) {
            System.out.print((num + 1) + " ");
        }

    }
}
