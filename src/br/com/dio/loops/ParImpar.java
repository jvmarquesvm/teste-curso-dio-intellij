package br.com.dio.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça N números inteiros, calcule e mostre
 * a quantidade de números pares e a quantidade de números impáres
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int qtdImpar = 0;
        int qtdpar = 0;

        while ( numero != -1 ){
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero != -1 ){
                int resto = numero % 2;
                if( resto == 0){
                    //System.out.println("Número Par: " + numero);
                    qtdpar++;
                } else {
                    //System.out.println("Número Ímpar: " + numero);
                    qtdImpar++;
                }
            }
        }

        System.out.println("Quantidade de números pares: " + qtdpar);
        System.out.println("Quantidade de números impares: " + qtdImpar);
    }
}
