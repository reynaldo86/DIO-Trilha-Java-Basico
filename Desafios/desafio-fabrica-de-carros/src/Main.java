import java.util.Scanner;

/**
 * Desafio
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
 * e dos impostos (aplicados ao custo de fábrica).
 *
 * O gerente de uma loja de carros gostaria de um programa
 * para calcular o preço de um carro novo para os clientes.
 *
 * Você receberá o custo de fábrica e as porcentagens referentes ao distribuidor e os impostos e deverá
 * escrever programa para ler esses valores e imprimir o valor final do carro.
 *
 * Entrada
 * Você recebera três valores inteiros que representam o custo de fábrica,
 * as porcentagens do distribuidor e os impostos.
 *
 * Saída
 * Como saída, teremos o valor final do preço de um carro novo.*/

/*
* Exemplo 1

Entrada
*
20000 - custo fabrica r$
28 - porcentagem distribuidor %
45 - impostos %
*
* Saída - 34600*/

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica:");
        int custoFabrica = scan.nextInt();

        System.out.println("Digite a porcentagem do distribuidor: ");
        int porcentagemDistribuidor = scan.nextInt();

        System.out.println("Digite a porcentagem dos impostos: ");
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * (porcentagemDistribuidor + PercentualImpostos)) / 100;

        ValorImpostos = Distribuidor;

        custoConsumidor = ValorImpostos + custoFabrica;

        System.out.println(custoConsumidor);

    }
}