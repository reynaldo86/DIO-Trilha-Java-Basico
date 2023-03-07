import dio.digitalinovation.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros);

        //.add() adiciona um item a Queue
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        //.offer() vai tentar adicionar um item a Queue, mas se não conseguir em vez de dar um erro ele retorna false
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        //.peek() retorna o primeiro elemento da pilha. Se estiver vazia  ele retorna nulo.
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //.poll() remove o primeiro item da pilha.
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

    }
}