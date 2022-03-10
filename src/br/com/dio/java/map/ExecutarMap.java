package br.com.dio.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExecutarMap {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome","João");
        aluno.put("Idade","17");
        aluno.put("Média","8.5");
        aluno.put("Turma","3C");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAluno = new ArrayList<>();

        listaAluno.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome","Maria");
        aluno2.put("Idade","16");
        aluno2.put("Média","9.5");
        aluno2.put("Turma","3B");

        listaAluno.add(aluno2);

        System.out.println(listaAluno);
        System.out.println(aluno.containsKey("Nome"));
        System.out.println(aluno.containsKey("RG"));

    }
}
