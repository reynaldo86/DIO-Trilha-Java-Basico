import java.util.*;

public class ComandosList {
    public static void main(String[] args) {

        System.out.println("Criar uma lista e adicione 7 notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(9.5);
        notas.add(9.0);
        notas.add(5.6);
        notas.add(5.0);
        notas.add(4.5);
        notas.add(6.5);
        notas.add(6.8);

        System.out.println(notas);
        System.out.println();

        for (double nota : notas) {
            System.out.println(nota);
        }

        //.indexOf() Exibe a posição de um determinado item.
        System.out.println("Exiba a posição da nota 7.9: " + notas.indexOf(5.0));

        //add(index,element) Adciona um elemento na posição desejada.
        System.out.println("Adiciona na lista a nota 8.0 n aposição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);
        System.out.println();

        //.set(index,element) Substitua a nota 5 pela nota 7.
        notas.set(3,7.0);
        System.out.println(notas);
        System.out.println();

        //.contains(element) Conferir na lista se existe uma determinada nota.
        System.out.println("Existe a nota 5 na lista: " + notas.contains(5.0));

        //.get() Exibe a terceira nota informada
        System.out.println("Nota na posição 3: " +notas.get(2));

        //Collections.max() Exibe a maior nota
        System.out.println("Maior nota: "+ Collections.max(notas));

        //Collections.min() Exibe a menor nota
        System.out.println("Maior nota: "+ Collections.min(notas));

        //Soma dos valores de uma List
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma das nota: " + soma);

        //Media das notas da List.
        System.out.println("Média das nota: " + (soma/notas.size()));

        //.remove(index ou obj) remove o item na posição escolhida ou obj escolhido.
        notas.remove(0);
        System.out.println(notas);

        //Remover notas menores que 7 e imprimir a lista no final.
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        //.clear apaga toda a lista
        notas.clear();

        //Verifica se a lista está vazia.
        System.out.println("Lista está vazia? "+ notas.isEmpty());



    }
}