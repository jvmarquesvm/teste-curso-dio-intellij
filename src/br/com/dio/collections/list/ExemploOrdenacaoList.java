package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ordenar Lista utilizando o comparable
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 3, "preto"));
            add(new Gato("Neguinha", 7, "marron"));
            add(new Gato("Neguinha", 2, "marron"));
        }};
        System.out.println("Ordem de Inserção");
        System.out.println(gatos);

        System.out.println("Ordem Aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Natural");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Idade");
        //Collections.sort(gatos, new CompararPorIdade());
        gatos.sort(new CompararPorIdade());
        System.out.println(gatos);

        System.out.println("Ordem Cor");
        gatos.sort(new CompararPorCor());
        System.out.println(gatos);

        System.out.println("Ordem Nome Cor Idade");
        //Collections.sort(gatos, new CompararPorNomeCorIdade());
        gatos.sort(new CompararPorNomeCorIdade());
        System.out.println(gatos);

    }
}

class CompararPorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class CompararPorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getNome().compareToIgnoreCase(gato2.getCor());
    }
}

class CompararPorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato1.getNome());
        if (nome != 0){
            return nome;
        }

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0){
            return cor;
        }

        int idade = gato1.getIdade().compareTo(gato2.getIdade());
        return idade;

    }
}