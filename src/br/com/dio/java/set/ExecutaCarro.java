package br.com.dio.java.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExecutaCarro {
    public static void main(String[] args) {
      //Set nao preserva ordem de inserção
      Set<Carro> hashSetCarro = new HashSet<>();
      hashSetCarro.add(new Carro("Ford"));
      hashSetCarro.add(new Carro("Volvo"));
      hashSetCarro.add(new Carro("Fiat"));
      hashSetCarro.add(new Carro("Ford"));
      hashSetCarro.add(new Carro("Zip"));
      hashSetCarro.add(new Carro("Alpha Romeo"));

      System.out.println("HashSet " + hashSetCarro);

      //Por ser uma estrutura de árvore é necessário implementar o método comparable
      //Estrutura ordenada
      Set<Carro> treeSetCarro = new TreeSet<>();
      treeSetCarro.add(new Carro("Ford"));
      treeSetCarro.add(new Carro("Volvo"));
      treeSetCarro.add(new Carro("Fiat"));
      treeSetCarro.add(new Carro("Ford"));
      treeSetCarro.add(new Carro("Zip"));
      treeSetCarro.add(new Carro("Alpha Romeo"));

      System.out.println("TreeSet " + treeSetCarro);

    }

}
