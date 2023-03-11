package dio.digitalinovation.exercicio;
/*
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
 * armazene-as em uma Lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
 * acima desta média, e em que mês elas ocorreram.
 * mostrar o mês por extenso: 1 -  Janeiro.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioListTemperatura {
    private static int count;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<>();

        for (int i = 0; i<=5; i ++){

            System.out.println("Digite a temperatura: " );
            temperatura.add(input.nextDouble());
        }

        System.out.println("Temperaturas dos últimos 6 meses: " + temperatura);

        //Soma dos valores de uma List
        Iterator<Double> iterator = temperatura.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        //Média dos valores da lista.
        Double media = soma / temperatura.size();
        System.out.printf("Média das temperaturas: %.1f", media);

        //Temperaturas acima da média
        Iterator<Double> iterator1 = temperatura.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < media ){
                iterator1.remove();
            }
        }
        System.out.println("\nTemperaturas acima da média: " + temperatura);

        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator2 = temperatura.iterator();

        count = 0;
        while (iterator2.hasNext()) {
            Double temp = iterator2.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }



    }





}
