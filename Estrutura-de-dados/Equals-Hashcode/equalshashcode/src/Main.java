import dio.digitalinovation.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Chevrolet".toLowerCase().trim()));
        listaCarro.add(new Carro("Ford".toLowerCase().trim()));
        listaCarro.add(new Carro("Fiat".toLowerCase().trim()));

        System.out.println(listaCarro.contains(new Carro("fiat")));
        System.out.println(new Carro("fiat").hashCode());


    }
}