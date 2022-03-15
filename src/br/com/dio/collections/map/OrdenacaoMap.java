package br.com.dio.collections.map;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        //Ordem Aleatória - hashMap
        Map<String, Livro> livrosMap = new HashMap<>(){{
            put("Howking, Stephen", new Livro("Uma Breve historia", 256));
            put("Duhin, Charles", new Livro("O Poder do Hábito", 400));
            put("Harari, Noah", new Livro("21 Lições Para o Sec. 21", 138));
        }};
        for(Map.Entry<String, Livro> entry: livrosMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        //Ordem Inserção - LinkedHashMap
        Map<String, Livro> livrosLinkedMap = new LinkedHashMap<>(){{
            put("Howking, Stephen", new Livro("Uma Breve historia", 256));
            put("Duhin, Charles", new Livro("O Poder do Hábito", 400));
            put("Harari, Noah", new Livro("21 Lições Para o Sec. 21", 138));
        }};
        for(Map.Entry<String, Livro> entry: livrosLinkedMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        //Ordenar pela chave - LinkedHashMap
        Map<String, Livro> livrosTreeMap = new TreeMap<>(livrosLinkedMap);
        for(Map.Entry<String, Livro> entry: livrosTreeMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        //Ordenar pela valor - TreeSet
                                                                   //Precisa de uma classe que implementa comparator
        Set<Map.Entry<String, Livro>> livrosTreeSet = new TreeSet<>(new Livro());
        livrosTreeSet.addAll(livrosMap.entrySet());

        for(Map.Entry<String, Livro> entry: livrosTreeSet){
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
