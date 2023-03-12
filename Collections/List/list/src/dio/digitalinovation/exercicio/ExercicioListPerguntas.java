package dio.digitalinovation.exercicio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".*/
public class ExercicioListPerguntas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Responda as perguntas com (S) Sim e (N) Não: ");

        System.out.print("\nTelefonou para vítima? ");
        String resposta = input.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nEsteve no local do crime? ");
        resposta = input.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nMora perto da vítima? ");
        resposta = input.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nDevia para a vítima? ");
        resposta = input.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nJá trabalhou com a vítima? ");
        resposta = input.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);


        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3, 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }


    }
}
