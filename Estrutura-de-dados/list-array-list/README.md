# List<>

### 
list pode ser definido como uma coleção ordenada de elementos. Esses elementos podem variar em relação ao tipo de dado — números inteiros, caracteres, booleanos ou decimais. Funciona como uma interface, que auxilia a própria interface das coleções, atuando na manipulação dos elementos internos e suas posições ocupadas.

Essa propriedade responsável pela ordenação de cada elemento em uma dada coleção é chamada índice — ou index, em inglês. Os elementos contidos em uma lista podem ser acessados por esses índices, além que ter a possibilidades de manipulá-los diretamente no Java list.


~~~ Java
public class Main {
    public static void main(String[] args) {
         List<Carro> listCarros = new ArrayList<>();
        
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("BMW"));

        listCarros.forEach(System.out::println);

        //.indexOf retorna em qual posição o item se encontra na lista.
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        //.remove() remove um item de um determinada posição.
        System.out.println(listCarros.remove(1));
    }       
}
~~~
Fonte:
[Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
