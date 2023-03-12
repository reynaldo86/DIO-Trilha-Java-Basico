/*Dadas as seguintes informaçoes sobre séries,
 crie um conjunto e ordene este conjunto exibindo:
 (nome- genero - tempo de episodio);*/

import entities.Serie;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Ordem aleatoria.
        System.out.println("---Ordem aleatória---");
        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie( "HOD", "Fantasia", 55));
        minhasSeries.add(new Serie( "TWD", "Terror", 60));
        minhasSeries.add(new Serie( "BRBA", "Crime", 55));

        for (Serie series : minhasSeries) {
            System.out.println(series.getNome() +"-"+series.getGenero()+"-"+series.getTempoEpisodio());
        }

        //Ordem de inserção
        System.out.println("---Ordem de inserção---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>();
        minhasSeries1.add(new Serie( "HOD", "Fantasia", 55));
        minhasSeries1.add(new Serie( "TWD", "Terror", 60));
        minhasSeries1.add(new Serie( "BRBA", "Crime", 55));

        for (Serie series : minhasSeries) {
            System.out.println(series.getNome() +"-"+series.getGenero()+"-"+series.getTempoEpisodio());
        }

        //Ordem Natural de tempo de episodio( implementar Comparable<entidade> na entidade)
        System.out.println("---Ordem Crescente---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie series : minhasSeries2) {
            System.out.println(series.getNome() +"-"+series.getGenero()+"-"+series.getTempoEpisodio());
        }

        //Ordenar por nome, genero e tempo.
        System.out.println("---Ordem Nome ou Genero ou Tempo---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for (Serie series : minhasSeries3) {
            System.out.println(series.getNome() +"-"+series.getGenero()+"-"+series.getTempoEpisodio());
        }


    }

}

