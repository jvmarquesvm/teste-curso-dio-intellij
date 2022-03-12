package br.com.dio.collections.set;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        Set<Double> notas = new LinkedHashSet<>();
        notas.add(5d);
        notas.add(0d);
        notas.add(3.6);
        notas.add(5d);
        notas.add(2d);
        notas.add(7d);
        System.out.println(notas);
        notas.clear();
        System.out.println("O conjunto está vazio? " + notas.isEmpty());
    }
}
