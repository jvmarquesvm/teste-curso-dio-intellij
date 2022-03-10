package br.com.dio.java.stack;

import java.util.Stack;

public class ExecutaCarro {
    public static void main(String[] args) {
        Stack<Carro> stackCarro = new Stack<>();
        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("Volvo"));
        stackCarro.push(new Carro("Fiat"));

        System.out.println(stackCarro);
        System.out.println(stackCarro.pop());
        System.out.println(stackCarro);

        System.out.println(stackCarro.peek());
        System.out.println(stackCarro);
        System.out.println(stackCarro.isEmpty());
    }
}
