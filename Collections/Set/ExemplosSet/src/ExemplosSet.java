import java.util.*;

public class ExemplosSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d , 3.6));
        System.out.println(notas);

        System.out.println("Conferir se a nota 5 esta no conjunto: ");
        System.out.println(notas.contains(5d));

        //Exibir o menor valor
        System.out.println("Menor valor no SET: " + Collections.min(notas));

        //Exibir o maior valor
        System.out.println("Menor valor no SET: " + Collections.max(notas));

        //Exibir a soma do s valores.
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        //Exibir a média das notas
        System.out.println("Média das notas: " + (soma / notas.size()));

        //Remover um item especifico
        notas.remove(0d);
        System.out.println("Valor removido com sucesso: " + notas);

        //Remover as notas menores que 7 e exiba a lista.
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println("Notas maiores que 7: " + notas);

        //Exibir em ordem de inserção (linkedHashSet).
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("Na ordem natural: " + notas2);

        //Exibir em ordem Crescente(TreeSet).
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Na ordem crescente: " + notas3);

        //Apagar listas
        notas.clear();
        notas2.clear();
        notas3.clear();

        //Verificar se as listas foram apagadas.
        System.out.println("List notas foi apagada: " + notas.isEmpty());
        System.out.println("List notas2 foi apagada: " + notas2.isEmpty());
        System.out.println("List notas3 foi apagada: " + notas3.isEmpty());



    }
}