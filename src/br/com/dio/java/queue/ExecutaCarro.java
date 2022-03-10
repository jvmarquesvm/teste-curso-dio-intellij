package br.com.dio.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExecutaCarro {
    public static void main(String[] args) {
        Queue<Carro> queueCarro = new LinkedList<>();
        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Fiat"));
        queueCarro.add(new Carro("Volvo"));
        queueCarro.add(new Carro("Peugeot"));

        System.out.println(queueCarro);
        //Se adicionar retorna true  / Se não retorna false
        System.out.println(queueCarro.offer(new Carro("Renault")));
        System.out.println(queueCarro);

        //Peek o primeiro elemento da fila e não remove / se tiver vazio retorna nulo
        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);

        //Peek o primeiro elemento da fila e remove / se tiver vazio retorna nulo
        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);

        System.out.println(queueCarro.size());
        System.out.println(queueCarro.isEmpty());

    }
}
