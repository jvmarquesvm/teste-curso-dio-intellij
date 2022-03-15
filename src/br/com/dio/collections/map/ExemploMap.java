package br.com.dio.collections.map;

import java.text.CollationElementIterator;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 12.1);
           put("mobi", 10.1);
           put("hb20", 16.1);
           put("celta", 16.2);
        }};
        System.out.println(carrosPopulares);
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println(carrosPopulares.containsKey("mercedes"));
        System.out.println(carrosPopulares.containsKey("uno"));
        System.out.println(carrosPopulares.get("uno"));
        Set<String> modelos = carrosPopulares.keySet();
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(modelos);
        System.out.println(consumos);

        System.out.println(Collections.max(carrosPopulares.values()));
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for ( Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo Mais Eficiente: " + modeloMaisEficiente + " Consumo: " + consumoMaisEficiente);
            }
        }

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for( Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo Menos eficiente: " + modeloMenosEficiente + " Consumo: " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma total: " + soma);

        System.out.println("Média: " + (soma/carrosPopulares.size()));

        while (iterator.hasNext()){
            if(iterator.next().equals(14.4)){
                iterator.remove();
            }
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopularesLinked = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 12.1);
            put("mobi", 10.1);
            put("hb20", 16.1);
            put("celta", 16.2);
        }};

        System.out.println(carrosPopularesLinked);

        //Fazer uma ordenação de acordo com as chaves
        Map<String, Double> carrosPopularesTreeMap = new TreeMap<>(carrosPopularesLinked);
        System.out.println(carrosPopularesTreeMap);

        carrosPopularesTreeMap.clear();
        System.out.println(carrosPopularesTreeMap.isEmpty());

    }
}
