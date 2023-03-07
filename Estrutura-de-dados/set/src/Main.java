import digitalinovation.Carro;

import java.util.*;

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

        System.out.println(treeSetCarros);


    }
}