# Set<>

### Set é uma interface, implementada tanto por HashSet quanto por TreeSet, entre outros.
Assim como List é uma interface que é implementada por ArrayList, Vector, LinkedList, etc

A diferença é que TreeSet implementa, na verdade, SortedSet, que por fim extende Set.

~~~ Java
public class Main {
    public static void main(String[] args) {
         Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("BMW"));
        hashSetCarros.add(new Carro("Volvo"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("BMW"));
        treeSetCarros.add(new Carro("Volvo"));
        
        // Retorna em ordem alfabética.
        System.out.println(treeSetCarros);
        
        //Saida TreeSet
        Carro{marca='BMW'}, 
        Carro{marca='Chevrolet'}, 
        Carro{marca='Fiat'}, 
        Carro{marca='Ford'}, 
        Carro{marca='Volvo'}]

    }       
}
~~~
Fonte:
[Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)
