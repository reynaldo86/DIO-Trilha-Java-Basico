# Stack<>

### O Stack classe representa um último a sair Pilha de objetos ( LIFO ). 
Estende a classe Vetor com cinco operações que permitem que um vetor seja tratado como uma pilha. 
O habitual push e pop operações são fornecidas, bem como um método para peek no item superior da pilha, um método para testar se a pilha é vazia(empty), 
e um método para pesquisar(search) a pilha de um item e descubra a que distância fica do topo.

~~~ Java
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
~~~
Fonte:
[Oracle](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html)
