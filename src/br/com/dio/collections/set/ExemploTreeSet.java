package br.com.dio.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        System.out.println("Exibir as notas em ordem crescente");
        Set<Double> notas = new TreeSet<>();
        notas.add(5d);
        notas.add(0d);
        notas.add(3.6);
        notas.add(5d);
        notas.add(2d);
        notas.add(7d);
        System.out.println(notas);
    }
}
