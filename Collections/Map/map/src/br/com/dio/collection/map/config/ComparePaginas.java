package br.com.dio.collection.map.config;

import br.com.dio.collection.map.entities.Livros;

import java.util.Comparator;
import java.util.Map;

public class ComparePaginas implements Comparator<Map.Entry<String, Livros>> {
    @Override
    public int compare(Map.Entry<String, Livros> livro1, Map.Entry<String, Livros> livro2) {
        return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
    }
}
