package br.com.dio.java.list;

import java.util.ArrayList;
import java.util.List;

public class ExecutaCarro {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();
        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Fiat"));
        listaCarro.add(new Carro("Pegeout"));

        System.out.println(listaCarro.contains(new Carro("Ford")));
        System.out.println(listaCarro.get(2));
        System.out.println(listaCarro.indexOf(new Carro("Pegeout")));
        System.out.println(listaCarro.remove(1));
        System.out.println(listaCarro);

    }
}
