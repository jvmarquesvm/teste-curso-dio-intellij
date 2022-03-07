package br.com.dio.listacircular;

public class ExecutaListaCircular {

    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();
        listaCircular.add("c1");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("c2");
        listaCircular.add("c3");
        listaCircular.add("c4");

        listaCircular.remove(1);
        listaCircular.add("c5");
        listaCircular.add("c6");
        listaCircular.add("c7");

        System.out.println(listaCircular);
        System.out.println(listaCircular.get(1));
        System.out.println(listaCircular.get(7));
        System.out.println(listaCircular.get(8));

    }
}
