package br.com.dio.pilha;

public class ExecutarPilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));
        pilha.push(new No(7));
        pilha.push(new No(8));
        pilha.push(new No(9));
        System.out.println(pilha.toString());

        System.out.println(pilha.pop());
        System.out.println(pilha.toString());

        pilha.push(new No(910));
        System.out.println(pilha.toString());

    }
}
