package br.com.dio.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe um valor válido
 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer nota = 0;

        while ( nota != -1 ){
            System.out.println("Digite sua nota: ");
            nota = scan.nextInt();
            if ( !(nota >= 0 && nota <= 10) ){
                System.out.println("Digite uma nota entre 0 e 10");
            }
        }
    }
}
