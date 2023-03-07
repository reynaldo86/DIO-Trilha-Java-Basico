# Queue<>

### 
Uma queue é uma estrutura de dados linear que segue o princípio FIFO (First-In, First-Out). Isso significa que o objeto inserido primeiro será o primeiro a sair, seguido pelo objeto inserido em seguida.

A queue suporta as seguintes operações principais:

Operações   | Função
--------- | ------
Enqueue |  Insere um item no final da queue.
Dequeue | Remove o objeto da frente da queue e o retorna, diminuindo assim o tamanho da queue em um.
Peek | Retorna o objeto na frente da queue sem removê-lo.
IsEmpty | Testa se a queue está vazia ou não.
Size | Retorna o número total de elementos presentes na queue.

~~~ Java
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
~~~
Fonte:
[Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)
