package br.com.dio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner numeroEntrada = new Scanner(System.in);

        System.out.println("Calcule o fatorial de: ");
        int numero = numeroEntrada.nextInt();

        int fatorial = 1;
        int resultado = 0;

        if (numero == 0 || numero == 1){
            resultado = 1;
        }

        for(int i = 1; i < numero; i++){
            if (fatorial == 1){
                fatorial = ( numero - i ) * numero;
           } else {
                fatorial = (numero - i) * resultado;
            }
            resultado = fatorial;
        }
        System.out.println(resultado);
    }
}
