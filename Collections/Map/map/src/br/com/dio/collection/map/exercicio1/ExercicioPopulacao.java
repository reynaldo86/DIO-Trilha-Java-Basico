package br.com.dio.collection.map.exercicio1;

import br.com.dio.collection.map.entities.Estados;
import br.com.dio.collection.map.entities.Livros;

import java.util.*;

public class ExercicioPopulacao {
    public static void main(String[] args) {

        //Exibir por ordem de inserção.
        Map<String, Estados> estadosMap = new LinkedHashMap<>();
        estadosMap.put("SP", new Estados("São Paulo", 41262199 ));
        estadosMap.put("MG", new Estados("Minas Gerais", 19597330 ));
        estadosMap.put("RJ", new Estados("Rio de Janeiro", 15989929 ));
        estadosMap.put("BA", new Estados("Bahia", 14016906 ));

        System.out.println(estadosMap);

        //Exibir em ordem alfabetica.
        Map<String, Estados> estadosMap1 = new TreeMap<>();
        estadosMap1.put("SP", new Estados("São Paulo", 41262199 ));
        estadosMap1.put("MG", new Estados("Minas Gerais", 19597330 ));
        estadosMap1.put("RJ", new Estados("Rio de Janeiro", 15989929 ));
        estadosMap1.put("BA", new Estados("Bahia", 14016906 ));

        System.out.println(estadosMap1);

        //Exibir estado com Maior e menor população.
        Map<String, Integer> estadosMap2 = new HashMap<>();
        estadosMap2.put("São Paulo", 41262199 );
        estadosMap2.put("Minas Gerais", 19597330 );
        estadosMap2.put("Rio de Janeiro", 15989929);
        estadosMap2.put("Bahia", 14016906 );

        Collection<Integer> populacao = estadosMap2.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estadosMap2.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        //Soma da populacao de todos os estados.
        Integer sum = 0;
        for (Integer value: estadosMap2.values()) {
            sum += value;
        }
        System.out.println("Total da populção dos estados: " + sum);

        //Média da população
        System.out.println("Média populacional: " + (sum/estadosMap2.size()));

        //Remover populacao menor de 18 milhões
        Iterator<Integer> iterator1 = estadosMap2.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next() < 18000000){
                iterator1.remove();
            }
        }
        System.out.println("Conjunto atualizado: " + estadosMap2);

        //Apagar o dicionário
        estadosMap2.clear();
        System.out.println("Dicionário apagado! ");

        //Verificar se está vazio
        System.out.println("Dicionário vazio? " + estadosMap2.isEmpty());


    }
}



