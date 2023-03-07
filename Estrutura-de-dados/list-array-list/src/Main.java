import dio.digitalinovation.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();
        
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("BMW"));

        listCarros.forEach(System.out::println);

        //.indexOf retornaem qual posição o item se encontra na pilha.
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        //.remove() remove um item de um determinada posição.
        System.out.println(listCarros.remove(1));
    }
}