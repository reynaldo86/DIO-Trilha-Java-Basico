package exerciciosFor;

import java.util.Scanner;

        /*
        🔸Tabuada: Desenvolva um gerador de tabuada,
        capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
        O usuário deve informar de qual numero ele deseja ver a tabuada.
        A saída deve ser conforme o exemplo abaixo:

        Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 X 10 = 50
        */

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja exibir? ");

        int tabuada = input.nextInt();
        System.out.println("Tabuada de " + tabuada + " :");

        for(int tab = 1; tab <= 10; tab++) {
            System.out.println(tabuada + " X " + tab + " = " + tabuada * tab);
        }
        input.close();
    }
}
