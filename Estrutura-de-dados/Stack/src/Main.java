import dio.digitalinovation.Carro;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        //imprime a pilha.
        System.out.println(stackCarros);

        //Apaga o último item da pilha.
        System.out.println(stackCarros.pop());

        //Retorna o tamanho da pilha.
        System.out.println(stackCarros.size());

        //.empty verifica se a pilha está vazia
        System.out.println(stackCarros.empty());


    }
}