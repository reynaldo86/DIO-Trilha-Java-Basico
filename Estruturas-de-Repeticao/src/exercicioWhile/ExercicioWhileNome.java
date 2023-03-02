package exercicioWhile;

import java.util.Scanner;

public class ExercicioWhileNome {
    /*
    🔸Nome e Idade: Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome)
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Digite seu nome: ");
            String nome = input.next();

            if(nome.equals("0")) break;

            System.out.println("Qual a sua idade: ");
            int idade = input.nextInt();
        }
    }
    }

