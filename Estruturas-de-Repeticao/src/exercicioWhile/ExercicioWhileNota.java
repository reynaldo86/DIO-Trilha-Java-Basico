package exercicioWhile;

import java.util.Scanner;

public class ExercicioWhileNota {
    /*
    🔸Nota: Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e continue pedindo
    até que o usuário informe um valor válido.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Digite uma valor entre 0 e 10: ");
            int nota = input.nextInt();

            if(nota >= 0 && nota <= 10) {
                break;

            }else {
                System.out.println("Valor inválido.");
            }
        }
        System.out.println("Programa finalizado.");

    }
}
