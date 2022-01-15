package br.com.dio.loops;

import java.util.Scanner;

/*
* Faça um programa que leia 5 números e
* informe o maior número e a média desses números
**/
public class MaiorMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maiorNumero = 0;
        int valorAnterior = 0;
        int valorTotal = 0;
        int contador = 0;
        int repetidor = 5;
        int[] valor = new int[repetidor];

        for(int i = 0; i < repetidor; i++){
            System.out.println("Digite um novo valor: ");
            valor[i] = scan.nextInt();
        }

        for (int i : valor) {
            if ( i > valorAnterior ) {
                maiorNumero = i;
                valorAnterior = i;
            }
            valorTotal = valorTotal  + i;
            contador++;
        }
        System.out.println("Media das Entradas: " + (valorTotal/contador) );
        System.out.println("Maior Numero:!! " + maiorNumero);
    }
}
