package br.com.dio.fila;

public class ExecutarFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("quarto");
        //fila.enqueue(11);
        //fila.enqueue(false);

        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila);

        fila.enqueue("ultimo");
        System.out.println(fila);
        System.out.println(fila.first());
        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila);

    }
}
