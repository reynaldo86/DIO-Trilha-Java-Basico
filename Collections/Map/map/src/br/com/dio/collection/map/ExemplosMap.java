package br.com.dio.collection.map;

import java.util.*;

public class ExemplosMap {
    public static void main(String[] args) {

        /*Dado so modelos dos carros e seus respectivos consumos na estrada, faça:
        * modelo = gol - consumo = 14,4km/l
        * modelo = uno - consumo = 15,6km/l
        * modelo = mobi - consumo = 16,1km/l
        * modelo = hb20 - consumo = 14,5km/l
        * modelo = kwid - consumo = 15,6km/l
        * */

        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 16.1);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);

        System.out.println(carrosPopulares);

        //Método .put() utilizado tanto para add como para atualizar.
        System.out.println("Substituir o consumo do Gol por 15.2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //Método .containsKey verifica se existe a key no dicionário.
        System.out.println("Conferir se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        //Método .get() passa o value da chave do objeto
        System.out.println("Exibe o consumo do uno: " + carrosPopulares.get("uno"));

        // Método .keySet() retorna as keys do dicionário.
        System.out.println("Exibir os modelos: " + carrosPopulares.keySet());

        // Método .values retorna todos os valores do dicionário.
        System.out.println("Exibir todos os comsumos: "+ carrosPopulares.values());

        // Retorna o com melhor consumo
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for ( Map.Entry<String, Double> entry: entries ) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiênte: " + modeloMaisEficiente+" - " + consumoMaisEficiente);
            }
        }

        //Exibir o modelo menos ecônomico e seu consumo.
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for ( Map.Entry<String, Double> entry: entries1 ) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiênte: " + modeloMenosEficiente+" - " + consumoMenosEficiente);
            }
        }

        //Exibir a soma dos consumos.

        //Primeira forma:
        double sum = 0;
        for (double value: carrosPopulares.values()) {
            sum += value;
        }
        System.out.println("Consumo total de todos os carros: " + sum);

        //Segunda forma:
        double sum1 = carrosPopulares.values().stream().mapToDouble (Double::doubleValue).sum();

        System.out.println("Consumo total de todos os carros: " + sum1);

        //Terceira forma
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("COnsumo total dos carros: " + soma);

        //Médias de consumo.
        double sum2 = carrosPopulares.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Média de consumo dos carros: " + (sum2 / carrosPopulares.size()));

        //Remover os modelos com o consumo 15.6 km/l.
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next() == 15.6){
                iterator1.remove();
            }
        }
        System.out.println("Conjunto atualizado: " + carrosPopulares);

        //Exibir todos os carros pela sua ordem de inserção.
        Map<String, Double> carrosPopularesOrdenados = new LinkedHashMap<>();
        carrosPopularesOrdenados.put("gol", 16.1);
        carrosPopularesOrdenados.put("uno", 15.6);
        carrosPopularesOrdenados.put("mobi", 16.1);
        carrosPopularesOrdenados.put("hb20", 14.5);
        carrosPopularesOrdenados.put("kwid", 15.6);

        System.out.println("Conjunto ordenado por inserção: " + carrosPopularesOrdenados);

        //Exibir todos os carros pela sua ordem de alfabetica de modelo.
        Map<String, Double> carrosPopularesModelo = new TreeMap<>();
        carrosPopularesModelo.put("gol", 16.1);
        carrosPopularesModelo.put("uno", 15.6);
        carrosPopularesModelo.put("mobi", 16.1);
        carrosPopularesModelo.put("hb20", 14.5);
        carrosPopularesModelo.put("kwid", 15.6);

        System.out.println("Conjunto ordenado por Modelo: " + carrosPopularesModelo);


        //Apague o conjunto de carros.
        carrosPopulares.clear();

        //Verifique se o conjunto está vazio.
        System.out.println("O conjunto está vazio: " + carrosPopulares.isEmpty());

    }
}