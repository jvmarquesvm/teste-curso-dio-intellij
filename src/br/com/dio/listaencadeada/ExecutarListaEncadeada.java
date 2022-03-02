package br.com.dio.listaencadeada;

public class ExecutarListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.add("teste1");
        lista.add("teste2");
        lista.add("teste3");
        lista.add("teste4");

        System.out.println(lista.get(3));
        System.out.println(lista.get(1));
        System.out.println(lista.get(0));
        System.out.println(lista.toStringEncadeada());

        System.out.println(lista.remove(3));
        System.out.println(lista.toStringEncadeada());

        System.out.println(lista.remove(1));
        System.out.println(lista.toStringEncadeada());
    }
}
