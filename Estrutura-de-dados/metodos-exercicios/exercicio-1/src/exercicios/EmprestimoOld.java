package exercicios;
/*
Calcule o valor final de um emprestimo, a partir do valor solicitado.
Taxas e parcelas influenciam.
Defina arbitrariamente as faixa que infuenciam nos valores.
 */

import java.util.Scanner;

public class EmprestimoOld {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            double valor;
            int meses;
            double valorParcelas;
            double valorFinal;
            double juros;
            double montante;

            System.out.println("======Empréstimos======");
            System.out.println("Digite um valor: ");
            valor = input.nextDouble();

            if (valor < 100){
                System.out.println("Não fornecemos empréstimos abaixo de 100.00. Tente novamente.");
            } else if (valor > 100 || valor < 5000) {

                System.out.println("Digite o numero de parcelas: ");
                meses = input.nextInt();
                if (meses >= 1 && meses <= 10){
                    juros = 0.10;

                    //Calcula juros ao mês.
                    montante = valor * (1 + juros);

                    //Valores das Parcelas.
                    valorParcelas = montante/meses;

                    for (int i = 1; i <= meses; i++ ){
                        System.out.printf(i + " x " + "%.2f\n", valorParcelas);

                    }
                    System.out.printf("Total a pagar R$: %.2f",montante);

                    break;

                } else if (meses > 10) {
                    juros = 0.20;

                    //Calcula juros ao mês.
                    montante = valor * (1 + juros);

                    //Valores das Parcelas.
                    valorParcelas = montante/meses;

                    for (int i = 1; i <= meses; i++ ){
                        System.out.printf(i + " x " + "%.2f\n", valorParcelas);

                    }
                    System.out.printf("Total a pagar R$: %.2f",montante);

                    break;

                }else if (valor >= 5000){
                    System.out.println("Digite o numero de parcelas: ");
                    meses = input.nextInt();
                    if (meses >= 1 && meses <= 10){
                        juros = 0.05;

                        //Calcula juros ao mês.
                        montante = valor * (1 + juros);

                        //Valores das Parcelas.
                        valorParcelas = montante/meses;

                        for (int i = 1; i <= meses; i++ ){
                            System.out.printf(i + " x " + "%.2f\n", valorParcelas);

                        }
                        System.out.printf("Total a pagar R$: %.2f",montante);

                        break;

                    } else if (meses > 10) {
                        juros = 0.15;

                        //Calcula juros ao mês.
                        montante = valor * (1 + juros);

                        //Valores das Parcelas.
                        valorParcelas = montante/meses;

                        for (int i = 1; i <= meses; i++ ){
                            System.out.printf(i + " x " + "%.2f\n", valorParcelas);

                        }
                        System.out.printf("Total a pagar R$: %.2f",montante);

                        break;

                }


            }
        }

    }
}}
