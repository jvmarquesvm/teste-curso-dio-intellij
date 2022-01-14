package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o valor 1: ");
        a = scan.nextInt();
        System.out.println("Digite o valor 2: ");
        b = scan.nextInt();

        int somatorio = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar= multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar: " + somatorio );
        System.out.println("subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
