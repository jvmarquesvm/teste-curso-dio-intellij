package br.com.dio.collections.set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5d, 9.3d, 5d, 7d, 0d, 3.6d));
        System.out.println(notas);

        System.out.println("A nota 6 está no conjunto? " + notas.contains(6d));
        System.out.println("A nota 5 está no conjunto? " + notas.contains(5d));

        System.out.println("Exiba a menor nota " + Collections.min(notas));
        System.out.println("Exiba a maior nota " + Collections.max(notas));

        Double resultado = 0d;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double nota = iterator.next();
            resultado += nota;
        }
        System.out.println("Soma de notas: " + resultado);
        System.out.println("Media de notas: " + (resultado / notas.size()));
        System.out.println("Remover a nota 0: " + notas.remove(0d));
        System.out.println(notas);

        System.out.println("Ordenando o Set");
        System.out.println("Ordem Aleatoria");

        Set<Serie> serie = new HashSet<>(){{

        }};



    }
}
