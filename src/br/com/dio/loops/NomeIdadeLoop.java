package br.com.dio.loops;

import java.util.Scanner;

/*
* Faça um programa que leia conjunto de dois valores o primeiro
* representando o nome do aluno e o segundo representando a sua idade.
* (Pare o programa inserindo o valor 0 no campo nome)
* */
public class NomeIdadeLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";
        String idade = "";

        do {
            System.out.println("Digite o nome: ");
            nome = scan.next();
            System.out.println("Digite a idade: ");
            idade = scan.next();
        }
        while (!nome.equalsIgnoreCase("0"));
    }
}
