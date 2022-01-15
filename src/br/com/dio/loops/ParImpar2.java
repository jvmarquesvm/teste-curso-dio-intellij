package br.com.dio.loops;

import java.util.Scanner;

public class ParImpar2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de iterações: ");
        int qtdRepeticao = scan.nextInt();
        int contador = 0;
        int qtdPares = 0;
        int qtdImpares = 0;

        do {

            System.out.println("Digite um número: ");

            int numero = scan.nextInt();

            if(numero % 2 == 0) {
                //System.out.println("Número é par");
                qtdPares++;
            } else {
                //System.out.println("Número é ímpar");
                qtdImpares++;
            }

            contador++;
        } while ( contador < qtdRepeticao );

        System.out.println("Quantidade pares: " + qtdPares);
        System.out.println("Quantidade impares: " + qtdImpares);
    }
}
