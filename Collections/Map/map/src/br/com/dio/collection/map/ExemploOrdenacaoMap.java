package br.com.dio.collection.map;

import br.com.dio.collection.map.config.ComparatorNome;
import br.com.dio.collection.map.config.ComparePaginas;
import br.com.dio.collection.map.entities.Livros;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        //HashMap()
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livros> livrosMap = new HashMap<>();
        livrosMap.put("Manel Loureiro", new Livros("O Último passageiro", 600));
        livrosMap.put("Bhargava", new Livros("Algoritmos", 180));
        livrosMap.put("Random Riggs", new Livros("Contos Peculiares", 250));

        for (Map.Entry<String, Livros> livro : livrosMap.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        //LinkedhashMap
        System.out.println("--\tOrdem de inserção\t--");
        Map<String, Livros> livrosMap1 = new LinkedHashMap<>();
        livrosMap1.put("Manel Loureiro", new Livros("O Último passageiro", 600));
        livrosMap1.put("Bhargava", new Livros("Algoritmos", 180));
        livrosMap1.put("Random Riggs", new Livros("Contos Peculiares", 250));

        for (Map.Entry<String, Livros> livro : livrosMap1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        //TreeMap
        System.out.println("--\tOrdem de Autores\t--");
        Map<String, Livros> livrosMap2 = new TreeMap<>(livrosMap1);
        for (Map.Entry<String, Livros> livro : livrosMap2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("--\tOrdem por nome dos livros\t--");

        //Precisa utilizar um comparator
        Set<Map.Entry<String, Livros>> livrosMap3 = new TreeSet<>(new ComparatorNome());
        livrosMap3.addAll(livrosMap.entrySet());
        for (Map.Entry<String, Livros> livro : livrosMap3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        //Comparar por paginas
        System.out.println("--\tOrdem por página dos livros\t--");
        Set<Map.Entry<String, Livros>> livrosMap4 = new TreeSet<>(new ComparePaginas());
        livrosMap4.addAll(livrosMap.entrySet());
        for (Map.Entry<String, Livros> livro : livrosMap4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

    }
}
