package br.com.dio.listaduplamenteencadeada;

public class ExecutaListaDuplEncadeada {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaDupl = new ListaDuplamenteEncadeada<>();
        listaDupl.add("c1");
        listaDupl.add("c2");
        listaDupl.add("c3");
        listaDupl.add("c4");
        listaDupl.add("c5");
        listaDupl.add("c6");
        listaDupl.add("c7");
        System.out.println(listaDupl);

        listaDupl.remove(3);
        System.out.println(listaDupl);

        listaDupl.add( "99", 3);
        System.out.println(listaDupl);

        System.out.println(listaDupl.get(3));
    }
}
